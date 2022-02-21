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
using ComunicarFormularios;


namespace August_Twelve__.net_
{
    public partial class Form1 : Form
    {

        public Ijs json { get; set; }
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
                            label.Click += handlerComun_Click;
                            label.Show();
                        }
                    }
                }
            }
        }
        private void handlerComun_Click(object sender, EventArgs e)
        {
            if (int.Parse(numericUpDown1.Text) > 0)
            {
                RestMesa ru = new RestMesa("http://localhost:8080/productos/" + ((Label)sender).Text.Split(' ')[0], "GET");
                Producto producto = JsonConvert.DeserializeObject<Producto>(ru.getItem());
                string pepe = "{\"cantidad\": " + numericUpDown1.Text + "," +
                    "\"producto\": {"+
        "\"id\": " + producto.id + "," +
        "\"nombre\": \"" + producto.nombre + "\"," +
        "\"descripcion\": \"" + producto.descripcion + "\"," +
        "\"precio\": " + producto.precio.ToString().Replace(',','.') + "," +
        "\"stock\": " + producto.stock + "," +
        "\"tipo\": \"" + producto.tipo + "\"," +
        "\"foto\": \"" + producto.foto + "\"" +
    "}}";

                json.Ejecutar(pepe);

                this.Close();
            }
        }
    }
}
