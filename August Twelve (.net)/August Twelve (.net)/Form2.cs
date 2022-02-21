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
        public string fechaenJson = "";
        public string arraydeLineas = "";
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
            fechaenJson = "\"fechaPedido\": \""+comanda.fechaPedido.ToString("yyyy-MM-dd")+"\",";
            


        } 

        private void btAdd_Click(object sender, EventArgs e)
        {
            Form1 frm = new Form1();
            frm.json = this;
            frm.Show();

            if (!json.Equals(""))
            {
                arraydeLineas += json;
            }
            
        }

        private void btDel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void check_Click(object sender, EventArgs e)
        {
            if (!json.Equals(""))
            {
                arraydeLineas += json ;
                string jsonfinal = "{ " +
                "\"pagado\":false," +
                fechaenJson +
                "\"lineasComanda\":["+arraydeLineas + "]," +
                "\"camarero\":{" +
                 "\"idCamarero\": 1," +
        "\"nombre\": \"Pepe\"," +
        "\"puesto\": \"Terraza\"," +
        "\"fechaInicio\": \"2022-02-20\"," +
        "\"telefono\": \"669447151\"," +
        /*"\"comandas\": [" +
          "\"1\"" +
        "]" +*/
      "}" ;

                Console.WriteLine(jsonfinal);
                RestMesa ru = new RestMesa("http://localhost:8080/comandas" , "POST");

                String res = ru.postItem(jsonfinal);
                
                this.Close();
            }
        }
    }
}
