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
            hideSubmenu();
            Console.WriteLine(rm.getItem());
        }

        private void buttonMesa_Click(object sender, EventArgs e)
        {
            showSubmenu(panelMesaSubmenu);
        }

        private void panelMenu_Paint(object sender, PaintEventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void hideSubmenu() {
            panelMesaSubmenu.Visible = false;
            panel1.Visible = false;
        }

        private void showSubmenu(Panel submenu) {
            if (submenu.Visible == false)
            {
                hideSubmenu();
                submenu.Visible = true;
            }
            else {
                submenu.Visible = false;
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            showSubmenu(panel1);
        }
    }
}
