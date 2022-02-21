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
    public partial class linea : Form
    {

        Comanda comanda = null;
        public linea(int idm)
        {

            InitializeComponent();
            
            comanda = new Comanda();
            comanda.pagado = false;
            comanda.fechaPedido = new DateTime();//pedir ayuda a quico
            

        }

        

        private void btAdd_Click(object sender, EventArgs e)
        {
            Form1 frm = new Form1();
            frm.Show();
            //avveriguar como sacar de aqui un objeto linea o producto
        }

        private void btDel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void check_Click(object sender, EventArgs e)
        {
            //preguntar quico como se serializan las cosas
            string jsonString = JsonSerializer.Serialize<Comanda>(comanda);
        }
    }
}
