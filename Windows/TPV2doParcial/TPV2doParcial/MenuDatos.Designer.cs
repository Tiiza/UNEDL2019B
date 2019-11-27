namespace TPV2doParcial
{
    partial class MenuDatos
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
            this.txtboxListaPalabras = new System.Windows.Forms.TextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.btnCapturar = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // txtboxListaPalabras
            // 
            this.txtboxListaPalabras.Location = new System.Drawing.Point(6, 29);
            this.txtboxListaPalabras.Multiline = true;
            this.txtboxListaPalabras.Name = "txtboxListaPalabras";
            this.txtboxListaPalabras.Size = new System.Drawing.Size(289, 147);
            this.txtboxListaPalabras.TabIndex = 0;
            this.txtboxListaPalabras.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.btnCapturar);
            this.groupBox1.Controls.Add(this.txtboxListaPalabras);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(301, 222);
            this.groupBox1.TabIndex = 1;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Lista de Palabras";
            // 
            // btnCapturar
            // 
            this.btnCapturar.Location = new System.Drawing.Point(110, 182);
            this.btnCapturar.Name = "btnCapturar";
            this.btnCapturar.Size = new System.Drawing.Size(82, 34);
            this.btnCapturar.TabIndex = 1;
            this.btnCapturar.Text = "Capturar";
            this.btnCapturar.UseVisualStyleBackColor = true;
            this.btnCapturar.Click += new System.EventHandler(this.btnCapturar_Click);
            // 
            // MenuDatos
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(325, 246);
            this.Controls.Add(this.groupBox1);
            this.Name = "MenuDatos";
            this.Text = "Datos";
            this.Load += new System.EventHandler(this.MenuDatos_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TextBox txtboxListaPalabras;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button btnCapturar;
    }
}