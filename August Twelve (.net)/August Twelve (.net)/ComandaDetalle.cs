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
    public partial class ComandaDetalle : Form
    {
        public ComandaDetalle(int idm, int idc)
        {
            InitializeComponent();
           
            RestMesa rm = new RestMesa("http://localhost:8080/mesas/" + idm, "GET");
            if (rm.getItem() != null)
            {
                Comanda comanda=null;
                Mesa mesa = JsonConvert.DeserializeObject<Mesa>(rm.getItem());
                foreach (Comanda c in mesa.comandas) {
                    if (c.id == idc)
                    {
                        comanda = c;
                    }
                }

                int i = 0;
                foreach (LineaComanda linea in comanda.lineas)
                {
                    Label unidad = new Label();
                    unidad.SetBounds(0, (i * 25), this.Parent.Width, 25);
                    unidad.Text = linea.producto.nombre;
                    unidad.ForeColor = Color.Black;
                    unidad.Parent = this;
                    i++;
                }
            }
        }


        public void nombreComanda(String foo) {
            label1.Text = foo;
        }
    }
    
}
