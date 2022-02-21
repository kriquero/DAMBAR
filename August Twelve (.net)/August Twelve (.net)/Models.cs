using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace August_Twelve__.net_
{
    class Mesa
    {
        public int id { get; set; }
        public string estado { get; set; }
        public List<Comanda> comandas { get; set; }
    }

    class Comanda
    {
        public int idComanda { get; set; }
        public bool pagado { get; set; }
        public DateTime fechaPedido { get; set; }
        public List<LineaComanda> lineas { get; set; }
        

    }
    class LineaComanda
    {
        public int id { get; set; } 
        public int cantidad { get; set; }
        public Producto producto { get; set; }
    }
    public class Producto
    {
        public int id { get; set; }
        public string nombre { get; set; }
        public string descripcion { get; set; }
        public decimal precio { get; set; }
        public int stock { get; set; }
        public string foto { get; set; }
        public string tipo { get; set; }

    }

    public class Camarero
    {
        public int idCamarero { get; set; }
        public String nombre { get; set; }
        public String puesto { get; set; }
        public DateTime fechaInicio { get; set; }
        public String telefono { get; set; }
    }
}
