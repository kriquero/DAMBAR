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
using ComunicarFormularios;


namespace August_Twelve__.net_
{
    public partial class linea : Form, Ijs
    {

        public string json = "";
        public void Ejecutar(string texto)
        {
            json = texto;
        }

        Comanda comanda = null;
        public linea(int idm)
        {

            InitializeComponent();

            comanda = new Comanda();
            comanda.pagado = false;
            comanda.fechaPedido =  DateTime.Today;
            string fechaenJson = comanda.fechaPedido.ToString("yyyy-MM-dd");
            Console.WriteLine(fechaenJson);


        } 

        private void btAdd_Click(object sender, EventArgs e)
        {
            Form1 frm = new Form1();
            frm.json = this;
            frm.Show();
            
        }

        private void btDel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void check_Click(object sender, EventArgs e)
        {

            Console.WriteLine(json);
        }
    }
}
