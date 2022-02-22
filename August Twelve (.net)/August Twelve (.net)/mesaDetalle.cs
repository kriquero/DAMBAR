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
        int idMesa;
        public mesaDetalle(int id)
        {
            idMesa = id;
            InitializeComponent();

            label1.Text = "Mesa " + id;
            RestMesa rm = new RestMesa("http://localhost:8080/mesas/"+id, "GET");
             Mesa mesa = JsonConvert.DeserializeObject<Mesa>(rm.getItem());
            int i =0;
            mesa.comandas.Reverse();
            foreach(Comanda comanda in mesa.comandas)
            {
                
                RestMesa ru = new RestMesa("http://localhost:8080/comandas/lineas/" + (comanda.idComanda), "GET");
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
                comandaY.Click += new EventHandler(handlerComun_Click);
                comandaY.Text = "Comanda " + (comanda.idComanda); 
                comandaY.Show();
                
                int o = 0;
                foreach (LineaComanda l in lineas) {

                    Label linea = new Label();
                    linea.Parent = unidad;
                    linea.AutoSize = true;
                    linea.Location = new Point(30, 50 + o*18);
                    linea.Size = new Size(100, 15);
                    linea.Font = new Font(linea.Font.Name, 12); 
                    if(!linea.Equals(""))
                    linea.Text = rellenaEspacios(rellenaEspacios(l.producto.nombre,100)
                        + l.cantidad + "    " + l.producto.precio*l.cantidad, 70);

                    
                    linea.BackColor = o%2==0? Color.Silver:Color.LightGray;
                    linea.Show();
                    o++;
                    
                }
                
            }
            RestMesa rest = new RestMesa("http://localhost:8080/mesas/factura/" + id, "GET");
             float totalvalor= JsonConvert.DeserializeObject<float>(rest.getItem());
            
            label2.Text = "Total a pagar: " + totalvalor.ToString();
            label2.Font = new Font(label2.Font.Name,20);
            
        }

        private string rellenaEspacios(string nombre, int hasta)
        {
            for (int i = nombre.Length; i <= hasta; i++) {
                nombre = nombre + " ";
            }
            return nombre;
        }

        private void handlerComun_Click(object sender, EventArgs e)
        {
            Console.WriteLine("elpepe");
            string idcomanda = ((Label)sender).Text.Split(' ')[1];
            linea frm = new linea();
            Console.WriteLine("-" + idcomanda + "-");
            frm.idcomandasimodifica = int.Parse(idcomanda);
            frm.Show();


        }

        private void button1_Click(object sender, EventArgs e)
        {
            linea linea = new linea();
            linea.mesaid = idMesa;
            linea.Show();
        }
    }
}
