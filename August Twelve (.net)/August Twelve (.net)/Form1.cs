using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;


namespace August_Twelve__.net_
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            RestMesa ru = new RestMesa("http://localhost:8080/productos/", "GET");
            Producto[] productos = JsonConvert.DeserializeObject<Producto[]>(ru.getItem());

            for (int i = 0; i <= productos.Length/4+1; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (i * 4 + j < productos.Length)
                    {
                        Producto producto = productos[i * 4 + j];
                        if (producto != null)
                        {
                            
                            Panel panel = new Panel();
                            panel.Parent = this;
                            panel.SetBounds(25 + j * 150, 25 + i * 100, 140, 90);
                            panel.BackColor = Color.White;
                            panel.Show();
                            


                            Label label = new Label();
                            label.Text = producto.id + " " + producto.nombre;
                            label.TextAlign = ContentAlignment.MiddleCenter;
                            label.ForeColor = Color.Black;
                            label.Parent = panel;
                            label.SetBounds(5, 70, 130, 15);
                            label.Show();
                        }
                    }
                }
            }
        }
    }
}
