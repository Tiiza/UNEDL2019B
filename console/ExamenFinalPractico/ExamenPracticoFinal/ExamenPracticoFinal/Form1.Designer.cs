namespace ExamenPracticoFinal
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblNombre = new System.Windows.Forms.Label();
            this.groupBoxDatosPersonales = new System.Windows.Forms.GroupBox();
            this.textBoxDireccion = new System.Windows.Forms.TextBox();
            this.lblDireccion = new System.Windows.Forms.Label();
            this.groupBoxSexo = new System.Windows.Forms.GroupBox();
            this.radioButtonOtro = new System.Windows.Forms.RadioButton();
            this.radioButtonMasculino = new System.Windows.Forms.RadioButton();
            this.radioButtonFemenino = new System.Windows.Forms.RadioButton();
            this.lblOtro = new System.Windows.Forms.Label();
            this.lblMasculino = new System.Windows.Forms.Label();
            this.lblFemenino = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.lblNac = new System.Windows.Forms.Label();
            this.lblApellido = new System.Windows.Forms.Label();
            this.textBoxApellido = new System.Windows.Forms.TextBox();
            this.textBoxNombre = new System.Windows.Forms.TextBox();
            this.groupBoxDatosB = new System.Windows.Forms.GroupBox();
            this.btnLimpiar = new System.Windows.Forms.Button();
            this.btnEjecutar = new System.Windows.Forms.Button();
            this.groupBoxOperacion = new System.Windows.Forms.GroupBox();
            this.radioButtonConsulta = new System.Windows.Forms.RadioButton();
            this.radioButtonRetiro = new System.Windows.Forms.RadioButton();
            this.radioButtonDeposito = new System.Windows.Forms.RadioButton();
            this.dateTimePickerFechaEje = new System.Windows.Forms.DateTimePicker();
            this.lblFechaEje = new System.Windows.Forms.Label();
            this.textBoxSaldo = new System.Windows.Forms.TextBox();
            this.lblSaldo = new System.Windows.Forms.Label();
            this.textBoxCantidad = new System.Windows.Forms.TextBox();
            this.lblCantidad = new System.Windows.Forms.Label();
            this.btnEdicion = new System.Windows.Forms.Button();
            this.btnCancelar = new System.Windows.Forms.Button();
            this.groupBoxDatosPersonales.SuspendLayout();
            this.groupBoxSexo.SuspendLayout();
            this.groupBoxDatosB.SuspendLayout();
            this.groupBoxOperacion.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblNombre
            // 
            this.lblNombre.AutoSize = true;
            this.lblNombre.Location = new System.Drawing.Point(17, 27);
            this.lblNombre.Name = "lblNombre";
            this.lblNombre.Size = new System.Drawing.Size(47, 13);
            this.lblNombre.TabIndex = 0;
            this.lblNombre.Text = "Nombre:";
            // 
            // groupBoxDatosPersonales
            // 
            this.groupBoxDatosPersonales.Controls.Add(this.textBoxDireccion);
            this.groupBoxDatosPersonales.Controls.Add(this.lblDireccion);
            this.groupBoxDatosPersonales.Controls.Add(this.groupBoxSexo);
            this.groupBoxDatosPersonales.Controls.Add(this.dateTimePicker1);
            this.groupBoxDatosPersonales.Controls.Add(this.lblNac);
            this.groupBoxDatosPersonales.Controls.Add(this.lblApellido);
            this.groupBoxDatosPersonales.Controls.Add(this.textBoxApellido);
            this.groupBoxDatosPersonales.Controls.Add(this.textBoxNombre);
            this.groupBoxDatosPersonales.Controls.Add(this.lblNombre);
            this.groupBoxDatosPersonales.Enabled = false;
            this.groupBoxDatosPersonales.Location = new System.Drawing.Point(12, 12);
            this.groupBoxDatosPersonales.Name = "groupBoxDatosPersonales";
            this.groupBoxDatosPersonales.Size = new System.Drawing.Size(582, 207);
            this.groupBoxDatosPersonales.TabIndex = 1;
            this.groupBoxDatosPersonales.TabStop = false;
            this.groupBoxDatosPersonales.Text = "Datos Personales";
            // 
            // textBoxDireccion
            // 
            this.textBoxDireccion.Location = new System.Drawing.Point(396, 27);
            this.textBoxDireccion.Multiline = true;
            this.textBoxDireccion.Name = "textBoxDireccion";
            this.textBoxDireccion.Size = new System.Drawing.Size(159, 139);
            this.textBoxDireccion.TabIndex = 8;
            // 
            // lblDireccion
            // 
            this.lblDireccion.AutoSize = true;
            this.lblDireccion.Location = new System.Drawing.Point(335, 27);
            this.lblDireccion.Name = "lblDireccion";
            this.lblDireccion.Size = new System.Drawing.Size(55, 13);
            this.lblDireccion.TabIndex = 7;
            this.lblDireccion.Text = "Direccion:";
            // 
            // groupBoxSexo
            // 
            this.groupBoxSexo.Controls.Add(this.radioButtonOtro);
            this.groupBoxSexo.Controls.Add(this.radioButtonMasculino);
            this.groupBoxSexo.Controls.Add(this.radioButtonFemenino);
            this.groupBoxSexo.Controls.Add(this.lblOtro);
            this.groupBoxSexo.Controls.Add(this.lblMasculino);
            this.groupBoxSexo.Controls.Add(this.lblFemenino);
            this.groupBoxSexo.Location = new System.Drawing.Point(20, 127);
            this.groupBoxSexo.Name = "groupBoxSexo";
            this.groupBoxSexo.Size = new System.Drawing.Size(323, 58);
            this.groupBoxSexo.TabIndex = 6;
            this.groupBoxSexo.TabStop = false;
            this.groupBoxSexo.Text = "Sexo:";
            this.groupBoxSexo.Enter += new System.EventHandler(this.groupBoxSexo_Enter);
            // 
            // radioButtonOtro
            // 
            this.radioButtonOtro.AutoSize = true;
            this.radioButtonOtro.Location = new System.Drawing.Point(218, 26);
            this.radioButtonOtro.Name = "radioButtonOtro";
            this.radioButtonOtro.Size = new System.Drawing.Size(14, 13);
            this.radioButtonOtro.TabIndex = 5;
            this.radioButtonOtro.TabStop = true;
            this.radioButtonOtro.UseVisualStyleBackColor = true;
            // 
            // radioButtonMasculino
            // 
            this.radioButtonMasculino.AutoSize = true;
            this.radioButtonMasculino.Location = new System.Drawing.Point(114, 26);
            this.radioButtonMasculino.Name = "radioButtonMasculino";
            this.radioButtonMasculino.Size = new System.Drawing.Size(14, 13);
            this.radioButtonMasculino.TabIndex = 4;
            this.radioButtonMasculino.TabStop = true;
            this.radioButtonMasculino.UseVisualStyleBackColor = true;
            // 
            // radioButtonFemenino
            // 
            this.radioButtonFemenino.AutoSize = true;
            this.radioButtonFemenino.Location = new System.Drawing.Point(21, 26);
            this.radioButtonFemenino.Name = "radioButtonFemenino";
            this.radioButtonFemenino.Size = new System.Drawing.Size(14, 13);
            this.radioButtonFemenino.TabIndex = 3;
            this.radioButtonFemenino.TabStop = true;
            this.radioButtonFemenino.UseVisualStyleBackColor = true;
            // 
            // lblOtro
            // 
            this.lblOtro.AutoSize = true;
            this.lblOtro.Location = new System.Drawing.Point(238, 26);
            this.lblOtro.Name = "lblOtro";
            this.lblOtro.Size = new System.Drawing.Size(27, 13);
            this.lblOtro.TabIndex = 2;
            this.lblOtro.Text = "Otro";
            // 
            // lblMasculino
            // 
            this.lblMasculino.AutoSize = true;
            this.lblMasculino.Location = new System.Drawing.Point(134, 26);
            this.lblMasculino.Name = "lblMasculino";
            this.lblMasculino.Size = new System.Drawing.Size(55, 13);
            this.lblMasculino.TabIndex = 1;
            this.lblMasculino.Text = "Masculino";
            // 
            // lblFemenino
            // 
            this.lblFemenino.AutoSize = true;
            this.lblFemenino.Location = new System.Drawing.Point(41, 26);
            this.lblFemenino.Name = "lblFemenino";
            this.lblFemenino.Size = new System.Drawing.Size(53, 13);
            this.lblFemenino.TabIndex = 0;
            this.lblFemenino.Text = "Femenino";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(119, 92);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(200, 20);
            this.dateTimePicker1.TabIndex = 5;
            // 
            // lblNac
            // 
            this.lblNac.AutoSize = true;
            this.lblNac.Location = new System.Drawing.Point(17, 98);
            this.lblNac.Name = "lblNac";
            this.lblNac.Size = new System.Drawing.Size(96, 13);
            this.lblNac.TabIndex = 4;
            this.lblNac.Text = "Fecha Nacimiento:";
            // 
            // lblApellido
            // 
            this.lblApellido.AutoSize = true;
            this.lblApellido.Location = new System.Drawing.Point(17, 54);
            this.lblApellido.Name = "lblApellido";
            this.lblApellido.Size = new System.Drawing.Size(47, 13);
            this.lblApellido.TabIndex = 3;
            this.lblApellido.Text = "Apellido:";
            // 
            // textBoxApellido
            // 
            this.textBoxApellido.Location = new System.Drawing.Point(70, 51);
            this.textBoxApellido.Name = "textBoxApellido";
            this.textBoxApellido.Size = new System.Drawing.Size(221, 20);
            this.textBoxApellido.TabIndex = 2;
            // 
            // textBoxNombre
            // 
            this.textBoxNombre.Location = new System.Drawing.Point(70, 24);
            this.textBoxNombre.Name = "textBoxNombre";
            this.textBoxNombre.Size = new System.Drawing.Size(221, 20);
            this.textBoxNombre.TabIndex = 1;
            // 
            // groupBoxDatosB
            // 
            this.groupBoxDatosB.Controls.Add(this.btnLimpiar);
            this.groupBoxDatosB.Controls.Add(this.btnEjecutar);
            this.groupBoxDatosB.Controls.Add(this.groupBoxOperacion);
            this.groupBoxDatosB.Controls.Add(this.dateTimePickerFechaEje);
            this.groupBoxDatosB.Controls.Add(this.lblFechaEje);
            this.groupBoxDatosB.Controls.Add(this.textBoxSaldo);
            this.groupBoxDatosB.Controls.Add(this.lblSaldo);
            this.groupBoxDatosB.Controls.Add(this.textBoxCantidad);
            this.groupBoxDatosB.Controls.Add(this.lblCantidad);
            this.groupBoxDatosB.Location = new System.Drawing.Point(12, 225);
            this.groupBoxDatosB.Name = "groupBoxDatosB";
            this.groupBoxDatosB.Size = new System.Drawing.Size(582, 213);
            this.groupBoxDatosB.TabIndex = 2;
            this.groupBoxDatosB.TabStop = false;
            this.groupBoxDatosB.Text = "Datos Bancarios";
            // 
            // btnLimpiar
            // 
            this.btnLimpiar.Location = new System.Drawing.Point(423, 70);
            this.btnLimpiar.Name = "btnLimpiar";
            this.btnLimpiar.Size = new System.Drawing.Size(75, 23);
            this.btnLimpiar.TabIndex = 8;
            this.btnLimpiar.Text = "Limpiar";
            this.btnLimpiar.UseVisualStyleBackColor = true;
            // 
            // btnEjecutar
            // 
            this.btnEjecutar.Location = new System.Drawing.Point(423, 30);
            this.btnEjecutar.Name = "btnEjecutar";
            this.btnEjecutar.Size = new System.Drawing.Size(75, 23);
            this.btnEjecutar.TabIndex = 7;
            this.btnEjecutar.Text = "Ejecutar";
            this.btnEjecutar.UseVisualStyleBackColor = true;
            // 
            // groupBoxOperacion
            // 
            this.groupBoxOperacion.Controls.Add(this.radioButtonConsulta);
            this.groupBoxOperacion.Controls.Add(this.radioButtonRetiro);
            this.groupBoxOperacion.Controls.Add(this.radioButtonDeposito);
            this.groupBoxOperacion.Location = new System.Drawing.Point(20, 136);
            this.groupBoxOperacion.Name = "groupBoxOperacion";
            this.groupBoxOperacion.Size = new System.Drawing.Size(323, 60);
            this.groupBoxOperacion.TabIndex = 6;
            this.groupBoxOperacion.TabStop = false;
            this.groupBoxOperacion.Text = "Operacion";
            // 
            // radioButtonConsulta
            // 
            this.radioButtonConsulta.AutoSize = true;
            this.radioButtonConsulta.Location = new System.Drawing.Point(205, 26);
            this.radioButtonConsulta.Name = "radioButtonConsulta";
            this.radioButtonConsulta.Size = new System.Drawing.Size(66, 17);
            this.radioButtonConsulta.TabIndex = 2;
            this.radioButtonConsulta.TabStop = true;
            this.radioButtonConsulta.Text = "Consulta";
            this.radioButtonConsulta.UseVisualStyleBackColor = true;
            // 
            // radioButtonRetiro
            // 
            this.radioButtonRetiro.AutoSize = true;
            this.radioButtonRetiro.Location = new System.Drawing.Point(118, 26);
            this.radioButtonRetiro.Name = "radioButtonRetiro";
            this.radioButtonRetiro.Size = new System.Drawing.Size(53, 17);
            this.radioButtonRetiro.TabIndex = 1;
            this.radioButtonRetiro.TabStop = true;
            this.radioButtonRetiro.Text = "Retiro";
            this.radioButtonRetiro.UseVisualStyleBackColor = true;
            // 
            // radioButtonDeposito
            // 
            this.radioButtonDeposito.AutoSize = true;
            this.radioButtonDeposito.Location = new System.Drawing.Point(21, 26);
            this.radioButtonDeposito.Name = "radioButtonDeposito";
            this.radioButtonDeposito.Size = new System.Drawing.Size(67, 17);
            this.radioButtonDeposito.TabIndex = 0;
            this.radioButtonDeposito.TabStop = true;
            this.radioButtonDeposito.Text = "Deposito";
            this.radioButtonDeposito.UseVisualStyleBackColor = true;
            // 
            // dateTimePickerFechaEje
            // 
            this.dateTimePickerFechaEje.Location = new System.Drawing.Point(132, 94);
            this.dateTimePickerFechaEje.Name = "dateTimePickerFechaEje";
            this.dateTimePickerFechaEje.Size = new System.Drawing.Size(200, 20);
            this.dateTimePickerFechaEje.TabIndex = 5;
            // 
            // lblFechaEje
            // 
            this.lblFechaEje.AutoSize = true;
            this.lblFechaEje.Location = new System.Drawing.Point(21, 100);
            this.lblFechaEje.Name = "lblFechaEje";
            this.lblFechaEje.Size = new System.Drawing.Size(105, 13);
            this.lblFechaEje.TabIndex = 4;
            this.lblFechaEje.Text = "Fecha de Ejecucion:";
            // 
            // textBoxSaldo
            // 
            this.textBoxSaldo.Location = new System.Drawing.Point(75, 54);
            this.textBoxSaldo.Name = "textBoxSaldo";
            this.textBoxSaldo.ReadOnly = true;
            this.textBoxSaldo.Size = new System.Drawing.Size(216, 20);
            this.textBoxSaldo.TabIndex = 3;
            // 
            // lblSaldo
            // 
            this.lblSaldo.AutoSize = true;
            this.lblSaldo.Location = new System.Drawing.Point(18, 57);
            this.lblSaldo.Name = "lblSaldo";
            this.lblSaldo.Size = new System.Drawing.Size(37, 13);
            this.lblSaldo.TabIndex = 2;
            this.lblSaldo.Text = "Saldo:";
            // 
            // textBoxCantidad
            // 
            this.textBoxCantidad.Location = new System.Drawing.Point(75, 27);
            this.textBoxCantidad.Name = "textBoxCantidad";
            this.textBoxCantidad.Size = new System.Drawing.Size(216, 20);
            this.textBoxCantidad.TabIndex = 1;
            // 
            // lblCantidad
            // 
            this.lblCantidad.AutoSize = true;
            this.lblCantidad.Location = new System.Drawing.Point(17, 30);
            this.lblCantidad.Name = "lblCantidad";
            this.lblCantidad.Size = new System.Drawing.Size(52, 13);
            this.lblCantidad.TabIndex = 0;
            this.lblCantidad.Text = "Cantidad:";
            // 
            // btnEdicion
            // 
            this.btnEdicion.Location = new System.Drawing.Point(633, 39);
            this.btnEdicion.Name = "btnEdicion";
            this.btnEdicion.Size = new System.Drawing.Size(75, 23);
            this.btnEdicion.TabIndex = 3;
            this.btnEdicion.Text = "Edicion";
            this.btnEdicion.UseVisualStyleBackColor = true;
            this.btnEdicion.Click += new System.EventHandler(this.btnEdicion_Click);
            // 
            // btnCancelar
            // 
            this.btnCancelar.Location = new System.Drawing.Point(633, 79);
            this.btnCancelar.Name = "btnCancelar";
            this.btnCancelar.Size = new System.Drawing.Size(75, 23);
            this.btnCancelar.TabIndex = 4;
            this.btnCancelar.Text = "Cancelar";
            this.btnCancelar.UseVisualStyleBackColor = true;
            this.btnCancelar.Click += new System.EventHandler(this.btnCancelar_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(746, 450);
            this.Controls.Add(this.btnCancelar);
            this.Controls.Add(this.btnEdicion);
            this.Controls.Add(this.groupBoxDatosB);
            this.Controls.Add(this.groupBoxDatosPersonales);
            this.Name = "Form1";
            this.Text = "Servicios Financieros SA de CV";
            this.groupBoxDatosPersonales.ResumeLayout(false);
            this.groupBoxDatosPersonales.PerformLayout();
            this.groupBoxSexo.ResumeLayout(false);
            this.groupBoxSexo.PerformLayout();
            this.groupBoxDatosB.ResumeLayout(false);
            this.groupBoxDatosB.PerformLayout();
            this.groupBoxOperacion.ResumeLayout(false);
            this.groupBoxOperacion.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblNombre;
        private System.Windows.Forms.GroupBox groupBoxDatosPersonales;
        private System.Windows.Forms.GroupBox groupBoxSexo;
        private System.Windows.Forms.Label lblOtro;
        private System.Windows.Forms.Label lblMasculino;
        private System.Windows.Forms.Label lblFemenino;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.Label lblNac;
        private System.Windows.Forms.Label lblApellido;
        private System.Windows.Forms.TextBox textBoxApellido;
        private System.Windows.Forms.TextBox textBoxNombre;
        private System.Windows.Forms.TextBox textBoxDireccion;
        private System.Windows.Forms.Label lblDireccion;
        private System.Windows.Forms.RadioButton radioButtonOtro;
        private System.Windows.Forms.RadioButton radioButtonMasculino;
        private System.Windows.Forms.RadioButton radioButtonFemenino;
        private System.Windows.Forms.GroupBox groupBoxDatosB;
        private System.Windows.Forms.Button btnLimpiar;
        private System.Windows.Forms.Button btnEjecutar;
        private System.Windows.Forms.GroupBox groupBoxOperacion;
        private System.Windows.Forms.RadioButton radioButtonConsulta;
        private System.Windows.Forms.RadioButton radioButtonRetiro;
        private System.Windows.Forms.RadioButton radioButtonDeposito;
        private System.Windows.Forms.DateTimePicker dateTimePickerFechaEje;
        private System.Windows.Forms.Label lblFechaEje;
        private System.Windows.Forms.TextBox textBoxSaldo;
        private System.Windows.Forms.Label lblSaldo;
        private System.Windows.Forms.TextBox textBoxCantidad;
        private System.Windows.Forms.Label lblCantidad;
        private System.Windows.Forms.Button btnEdicion;
        private System.Windows.Forms.Button btnCancelar;
    }
}

