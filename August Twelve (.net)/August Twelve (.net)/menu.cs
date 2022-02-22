using Newtonsoft.Json;
using System;
using System.Drawing;
using System.Windows.Forms;


namespace August_Twelve__.net_
{
    public partial class menu : Form
    {
       private Mesa[] mesas;
        
        public menu()
        {
            RestMesa rm = new RestMesa("http://localhost:8080/mesas", "GET");
            InitializeComponent();

            mesas = JsonConvert.DeserializeObject<Mesa[]>(rm.getItem());


        }


        private void Form1_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < mesas.Length; i++)
            {
                Button unidad = new Button();
                unidad.SetBounds(0, panelLogo.Height + (i * 25), 200, 25);
                unidad.Font = new Font(unidad.Font.Name, 12);
                unidad.Text = "mesa " + mesas[i].id;
                unidad.ForeColor = Color.White;
                unidad.FlatStyle = FlatStyle.Flat;
                unidad.FlatAppearance.BorderSize = 0;
                unidad.Click += new EventHandler(handlerComun_Click);
                unidad.Parent = panelMenu;
            }
            
            

        }

        private void handlerComun_Click(object sender, EventArgs e) {
            string[] pepe = ((Button)sender).Text.Split();

            int idMesa = int.Parse(pepe[1]) ;

            muestraMesaDetalle(idMesa);

        }

        private void muestraMesaDetalle(int id) {
            reset(new mesaDetalle(id));
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

        private void menu_Activated(object sender, EventArgs e)
        {
            //this.mesaDetalle.Focus();
        }
    }
}
