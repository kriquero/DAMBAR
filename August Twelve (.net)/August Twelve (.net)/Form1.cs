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
    public partial class Form1 : Form
    {
        public Form1()
        {
            RestMesa rm = new RestMesa("http://localhost:8080/mesas", "GET");
            InitializeComponent();
           
            Console.WriteLine(rm.getItem());
        }


        private void Form1_Load(object sender, EventArgs e)
        {
            int i = 1;
            Button unidad = new Button();
            unidad.SetBounds(0, panelLogo.Height + (i * 25), 200, 25);
            unidad.Text = "mesa " + "id de la mesa";
            unidad.Click += new System.EventHandler(muestraMesaDetalle(1),);
            panelMenu.Controls.Add(unidad);

        }

        private void muestraMesaDetalle(int id) {
            reset(new mesaDetalle());
        }

        private void btMesaUnidad_Click(object sender, EventArgs e)
        {
            
            reset(new mesaDetalle());
        }

        private void reset(object formfill) {

            if (this.panel1.Controls.Count > 0) {

                this.panel1.Controls.RemoveAt(0);
            }
            Form figlio = formfill as Form;
            figlio.TopLevel = false;
            figlio.Dock = DockStyle.Fill;
            this.panel1.Controls.Add(figlio);
            this.panel1.Tag = figlio;
            figlio.Show();

        }
    }
}
