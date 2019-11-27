namespace UsingPrintHelper
{
    partial class Alumno
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.NombreLabel = new System.Windows.Forms.Label();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.MatriculaLabel = new System.Windows.Forms.Label();
            this.txtMatricula = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.GradoLAbel = new System.Windows.Forms.Label();
            this.GrupoLabel = new System.Windows.Forms.Label();
            this.gradoUpDw = new System.Windows.Forms.NumericUpDown();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.bttCredencial = new System.Windows.Forms.Button();
            this.bttCancelar = new System.Windows.Forms.Button();
            this.gbInfo = new System.Windows.Forms.GroupBox();
            this.checkBoxVip = new System.Windows.Forms.CheckBox();
            this.gbTalleres = new System.Windows.Forms.GroupBox();
            this.listbTalleres = new System.Windows.Forms.ListBox();
            ((System.ComponentModel.ISupportInitialize)(this.gradoUpDw)).BeginInit();
            this.gbInfo.SuspendLayout();
            this.gbTalleres.SuspendLayout();
            this.SuspendLayout();
            // 
            // NombreLabel
            // 
            this.NombreLabel.AutoSize = true;
            this.NombreLabel.Location = new System.Drawing.Point(51, 36);
            this.NombreLabel.Name = "NombreLabel";
            this.NombreLabel.Size = new System.Drawing.Size(44, 13);
            this.NombreLabel.TabIndex = 0;
            this.NombreLabel.Text = "Nombre";
            // 
            // txtNombre
            // 
            this.txtNombre.Location = new System.Drawing.Point(107, 33);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.Size = new System.Drawing.Size(215, 20);
            this.txtNombre.TabIndex = 1;
            this.txtNombre.TextChanged += new System.EventHandler(this.txtNombre_TextChanged);
            // 
            // MatriculaLabel
            // 
            this.MatriculaLabel.AutoSize = true;
            this.MatriculaLabel.Location = new System.Drawing.Point(51, 76);
            this.MatriculaLabel.Name = "MatriculaLabel";
            this.MatriculaLabel.Size = new System.Drawing.Size(50, 13);
            this.MatriculaLabel.TabIndex = 2;
            this.MatriculaLabel.Text = "Matricula";
            // 
            // txtMatricula
            // 
            this.txtMatricula.Location = new System.Drawing.Point(107, 73);
            this.txtMatricula.Name = "txtMatricula";
            this.txtMatricula.Size = new System.Drawing.Size(215, 20);
            this.txtMatricula.TabIndex = 3;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(97, 138);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(0, 13);
            this.label3.TabIndex = 4;
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // GradoLAbel
            // 
            this.GradoLAbel.AutoSize = true;
            this.GradoLAbel.Location = new System.Drawing.Point(51, 111);
            this.GradoLAbel.Name = "GradoLAbel";
            this.GradoLAbel.Size = new System.Drawing.Size(36, 13);
            this.GradoLAbel.TabIndex = 6;
            this.GradoLAbel.Text = "Grado";
            // 
            // GrupoLabel
            // 
            this.GrupoLabel.AutoSize = true;
            this.GrupoLabel.Location = new System.Drawing.Point(201, 111);
            this.GrupoLabel.Name = "GrupoLabel";
            this.GrupoLabel.Size = new System.Drawing.Size(36, 13);
            this.GrupoLabel.TabIndex = 7;
            this.GrupoLabel.Text = "Grupo";
            // 
            // gradoUpDw
            // 
            this.gradoUpDw.Location = new System.Drawing.Point(107, 108);
            this.gradoUpDw.Maximum = new decimal(new int[] {
            8,
            0,
            0,
            0});
            this.gradoUpDw.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.gradoUpDw.Name = "gradoUpDw";
            this.gradoUpDw.Size = new System.Drawing.Size(85, 20);
            this.gradoUpDw.TabIndex = 9;
            this.gradoUpDw.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(243, 108);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(79, 20);
            this.textBox1.TabIndex = 10;
            // 
            // bttCredencial
            // 
            this.bttCredencial.Location = new System.Drawing.Point(129, 313);
            this.bttCredencial.Name = "bttCredencial";
            this.bttCredencial.Size = new System.Drawing.Size(75, 23);
            this.bttCredencial.TabIndex = 11;
            this.bttCredencial.Text = "Credencial";
            this.bttCredencial.UseVisualStyleBackColor = true;
            this.bttCredencial.Click += new System.EventHandler(this.bttCredencial_Click);
            // 
            // bttCancelar
            // 
            this.bttCancelar.Location = new System.Drawing.Point(255, 313);
            this.bttCancelar.Name = "bttCancelar";
            this.bttCancelar.Size = new System.Drawing.Size(75, 23);
            this.bttCancelar.TabIndex = 12;
            this.bttCancelar.Text = "Cancelar";
            this.bttCancelar.UseVisualStyleBackColor = true;
            this.bttCancelar.Click += new System.EventHandler(this.bttCancelar_Click);
            // 
            // gbInfo
            // 
            this.gbInfo.Controls.Add(this.checkBoxVip);
            this.gbInfo.Controls.Add(this.NombreLabel);
            this.gbInfo.Controls.Add(this.txtNombre);
            this.gbInfo.Controls.Add(this.MatriculaLabel);
            this.gbInfo.Controls.Add(this.GrupoLabel);
            this.gbInfo.Controls.Add(this.gradoUpDw);
            this.gbInfo.Controls.Add(this.textBox1);
            this.gbInfo.Controls.Add(this.txtMatricula);
            this.gbInfo.Controls.Add(this.GradoLAbel);
            this.gbInfo.Location = new System.Drawing.Point(12, 12);
            this.gbInfo.Name = "gbInfo";
            this.gbInfo.Size = new System.Drawing.Size(410, 177);
            this.gbInfo.TabIndex = 13;
            this.gbInfo.TabStop = false;
            this.gbInfo.Text = "Informacion de Registro";
            // 
            // checkBoxVip
            // 
            this.checkBoxVip.AutoSize = true;
            this.checkBoxVip.Location = new System.Drawing.Point(107, 145);
            this.checkBoxVip.Name = "checkBoxVip";
            this.checkBoxVip.Size = new System.Drawing.Size(43, 17);
            this.checkBoxVip.TabIndex = 11;
            this.checkBoxVip.Text = "VIP";
            this.checkBoxVip.UseVisualStyleBackColor = true;
            // 
            // gbTalleres
            // 
            this.gbTalleres.Controls.Add(this.listbTalleres);
            this.gbTalleres.Location = new System.Drawing.Point(12, 196);
            this.gbTalleres.Name = "gbTalleres";
            this.gbTalleres.Size = new System.Drawing.Size(410, 100);
            this.gbTalleres.TabIndex = 14;
            this.gbTalleres.TabStop = false;
            this.gbTalleres.Text = "Lista de Talleres";
            // 
            // listbTalleres
            // 
            this.listbTalleres.FormattingEnabled = true;
            this.listbTalleres.Items.AddRange(new object[] {
            "Taller Uno",
            "Taller Dos",
            "Taller Tres",
            "Taller Cuatro",
            "Taller Cinco",
            "Taller Seis",
            "Taller Siete",
            "Taller Ocho"});
            this.listbTalleres.Location = new System.Drawing.Point(7, 20);
            this.listbTalleres.Name = "listbTalleres";
            this.listbTalleres.Size = new System.Drawing.Size(397, 69);
            this.listbTalleres.TabIndex = 0;
            // 
            // Alumno
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(449, 360);
            this.Controls.Add(this.gbTalleres);
            this.Controls.Add(this.gbInfo);
            this.Controls.Add(this.bttCancelar);
            this.Controls.Add(this.bttCredencial);
            this.Controls.Add(this.label3);
            this.Name = "Alumno";
            this.Text = "Alumno";
            this.Load += new System.EventHandler(this.Alumno_Load);
            ((System.ComponentModel.ISupportInitialize)(this.gradoUpDw)).EndInit();
            this.gbInfo.ResumeLayout(false);
            this.gbInfo.PerformLayout();
            this.gbTalleres.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label NombreLabel;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.Label MatriculaLabel;
        private System.Windows.Forms.TextBox txtMatricula;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label GradoLAbel;
        private System.Windows.Forms.Label GrupoLabel;
        private System.Windows.Forms.NumericUpDown gradoUpDw;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Button bttCredencial;
        private System.Windows.Forms.Button bttCancelar;
        private System.Windows.Forms.GroupBox gbInfo;
        private System.Windows.Forms.CheckBox checkBoxVip;
        private System.Windows.Forms.GroupBox gbTalleres;
        private System.Windows.Forms.ListBox listbTalleres;
    }
}