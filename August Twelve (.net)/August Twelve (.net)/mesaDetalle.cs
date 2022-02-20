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
                comandaY.Size = new Size(100, 30);
                comandaY.Text = "Comanda " + comanda; 
                comandaY.Show();
                /*
                foreach (LineaComanda l in comanda.lineas) {

                    Label linea = new Label();
                    linea.Parent = unidad;
                    linea.AutoSize = true;
                    linea.Location = new Point(30, 40);
                    linea.Size = new Size(100, 30);
                    linea.Text = l.producto.nombre;
                    linea.Show();


                }*/
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine("cositas");
        }
    }
}
