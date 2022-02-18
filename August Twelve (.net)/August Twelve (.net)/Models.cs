using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace August_Twelve__.net_
{
    class Models
    {
        public int id { get; set; }
        public String estado { get; set; }
        public List<Comanda> comandas { get; set; }
    }

    class MesaModel
    {
        public int id { get; set; }
        public String estado { get; set; }
        public List<object> comandas { get; set; }
    }
}
