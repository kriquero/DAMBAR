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
        public int idcomandasimodifica = 0;
        public string json = "";
        public string fechaenJson = "";
        public string arraydeLineas = "";
        
        public void Ejecutar(string texto)
        {
            json = texto;
        }

        Comanda comanda = null;
        public int mesaid = 0;
        public linea()
        {

            InitializeComponent();

            comanda = new Comanda();
            comanda.pagado = false;
            comanda.fechaPedido =  DateTime.Today;
            fechaenJson = "\"fechaPedido\": \""+comanda.fechaPedido.ToString("yyyy-MM-dd")+"\",";
            


            }
        private void llenaElLabel(Comanda c)
        {
            RestMesa ru = new RestMesa("http://localhost:8080/comandas/lineas/" + (c.idComanda), "GET");
            LineaComanda[] lineas = JsonConvert.DeserializeObject<LineaComanda[]>(ru.getItem());
            foreach (LineaComanda l in lineas)
            {
                string aux = (l.Equals(lineas.First())) ? "" : ",";
                arraydeLineas += aux +"{\"cantidad\": " + l.cantidad + "," +
                    "\"producto\": {" +
        "\"id\": " + l.producto.id + "," +
        "\"nombre\": \"" + l.producto.nombre + "\"," +
        "\"descripcion\": \"" + l.producto.descripcion + "\"," +
        "\"precio\": " + l.producto.precio.ToString().Replace(',', '.') + "," +
        "\"stock\": " + l.producto.stock + "," +
        "\"tipo\": \"" + l.producto.tipo + "\"," +
        "\"foto\": \"" + l.producto.foto + "\"" +
    "}}";
                label1.Text += l.cantidad + "   " + l.producto.nombre + "   " + l.producto.precio + "\n";
            }
        }
        private void btAdd_Click(object sender, EventArgs e)
        {
            Form1 frm = new Form1();
            frm.json = this;
            frm.Show();

            if (!json.Equals(""))
            {
                
                arraydeLineas += json.Substring(0,json.Length-1).Replace("\"productos\"","")+"},";
            }
            else if(label1.Text.Length > 0)
            {
                arraydeLineas += ",";
            }
            
        }

        private void btDel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void check_Click(object sender, EventArgs e)
        {
            
            if (idcomandasimodifica<=0) { 
                if (!json.Equals(""))
                {
                    arraydeLineas += json;
                    string jsonfinal = "{ " +
                    "\"pagado\":false," +
                    fechaenJson +
                    "\"lineasComanda\":[" + arraydeLineas + "]" +
                    "}";

                    
                    RestMesa ru = new RestMesa("http://localhost:8080/mesas/addComanda/" + mesaid, "PUT");
                   
                    String res = ru.postItem(jsonfinal);

                    this.Close();
                }
            }
            else
            {
                arraydeLineas += json;
                    string jsonfinal = "{ \"idComanda\": " + idcomandasimodifica +","+
                    "\"pagado\":false," +
                    fechaenJson +
                    "\"lineasComanda\":[" + arraydeLineas + "]" +
                    "}";

                   
                    RestMesa ru = new RestMesa("http://localhost:8080/comandas/" + idcomandasimodifica, "PUT");

                    String res = ru.putItem(jsonfinal);

                    this.Close();
            }
        }

        private void linea_Activated(object sender, EventArgs e)
        {
            if (idcomandasimodifica > 0 && label1.Text.Length<1)
            {
                RestMesa rutemburgo = new RestMesa("http://localhost:8080/comandas/" + idcomandasimodifica, "GET");
                llenaElLabel(JsonConvert.DeserializeObject<Comanda>(rutemburgo.getItem()));
            }
            if (!json.Equals(""))
            {
                label1.Font = new Font(label1.Font.Name, 12);
                LineaComanda lin = JsonConvert.DeserializeObject<LineaComanda>(json);
                label1.Text += lin.cantidad + "   " + lin.producto.nombre + "   " + lin.producto.precio + "\n";
           }
        }
    }
}
