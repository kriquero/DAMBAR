using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace August_Twelve__.net_
{
    public partial class mesaDetalle : Form
    {
        public mesaDetalle(int id)
        {
            
            InitializeComponent();

            label1.Text = "Mesa " + id;
            RestMesa rm = new RestMesa("http://localhost:8080/mesas/"+id, "GET");
             Mesa mesa = JsonConvert.DeserializeObject<Mesa>(rm.getItem());
            int i =0;
            foreach(Comanda comanda in mesa.comandas)
            {
                RestMesa ru = new RestMesa("http://localhost:8080/comandas/lineas/" + (comanda.id+1), "GET");
                LineaComanda[] lineas = JsonConvert.DeserializeObject<LineaComanda[]>(ru.getItem());

                Panel unidad = new Panel();
                unidad.SetBounds(0, (i * 100), 100, 300);
                unidad.Parent = panelComandas;
                unidad.Dock = DockStyle.Top;
                unidad.BackColor = Color.White;
                unidad.Show();
                i++;
                Label comandaY = new Label();
                comandaY.Parent = unidad;
                comandaY.AutoSize = true;
                comandaY.Location = new Point(25,25);
                comandaY.Font = new Font(comandaY.Font.Name, 15);
                comandaY.Size = new Size(100, 30);
                comandaY.Text = "Comanda " + (comanda.id+1); 
                comandaY.Show();
                int o = 0;
                foreach (LineaComanda l in lineas) {

                    Label linea = new Label();
                    linea.Parent = unidad;
                    linea.AutoSize = true;
                    linea.Location = new Point(30, 50 + o*18);
                    linea.Size = new Size(100, 15);
                    linea.Font = new Font(linea.Font.Name, 12); 
                    linea.Text = rellenaEspacios(rellenaEspacios(l.producto.nombre,100)
                        + l.cantidad + "    " + l.producto.precio*l.cantidad, 70);
                    linea.BackColor = o%2==0? Color.Silver:Color.LightGray;
                    linea.Show();
                    o++;
                    

                    Image icono = Image.FromFile("mas.png");

                    botonLineas(o, icono);

                }
            }
        }

        private string rellenaEspacios(string nombre, int hasta)
        {
            for (int i = nombre.Length; i <= hasta; i++) {
                nombre = nombre + " ";
            }
            return nombre;
        }

        private void botonLineas(int i, Image image) {
            Button unidad = new Button();
            unidad.SetBounds(300, 50 + i * 18, 17, 17);
            unidad.Image = image;
            unidad.ForeColor = Color.White;
            unidad.FlatStyle = FlatStyle.Flat;
            unidad.FlatAppearance.BorderSize = 0;
            //unidad.Click += new EventHandler(lo que hace le botonee);
            unidad.Parent = panelComandas;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine("cositas");
        }
    }
}
