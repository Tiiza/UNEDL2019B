using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ExamenPracticoFinal
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void groupBoxSexo_Enter(object sender, EventArgs e)
        {

        }

        private void btnEdicion_Click(object sender, EventArgs e)
        {
            this.groupBoxDatosPersonales.Enabled = true;
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            if (this.groupBoxDatosPersonales.Enabled == true) {
                this.groupBoxDatosPersonales.Enabled = false;
            }
            else
            {
                MessageBox.Show("Accion no posible el campo ya esta desabilitado");
            }
        }
    }
}
