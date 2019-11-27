using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TPV2doParcial
{
    public partial class MenuArchivo : Form
    {
        public MenuArchivo()
        {
            InitializeComponent();
        }

        private void btnCrear_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = new StreamWriter("Lista palabras.txt")) ;

        }

        private void btnLeer_Click(object sender, EventArgs e)
        {
            string line = "";
            using (StreamReader sr = new StreamReader("Lista palabras.txt"))
            {
                while((line = sr.ReadLine()) != null)
                {
                    Console.WriteLine(line);
                }
            }
            Console.ReadKey();
        }

        private void btnEscribir_Click(object sender, EventArgs e)
        {
            MenuDatos menu = new MenuDatos();
            menu.MdiParent = this;
            menu.Show();

        }
    }
}
