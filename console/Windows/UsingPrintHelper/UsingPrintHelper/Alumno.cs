using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UsingPrintHelper
{
    public partial class Alumno : Form
    {
        public Alumno()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Alumno_Load(object sender, EventArgs e)
        {

        }


        private void txtNombre_TextChanged(object sender, EventArgs e)
        {

        }

        private void bttCancelar_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void bttCredencial_Click(object sender, EventArgs e)
        {
            String nom = txtNombre.Text;
            String mat = txtMatricula.Text;
            String gra = txtGrado.Text;
            String gru = txtGrupo.Text;
            String tall = txtTaller.Text;
            Credencial credencial = new Credencial(nom, mat, gra, gru, tall);
            credencial.Show();
        }
    }
}
