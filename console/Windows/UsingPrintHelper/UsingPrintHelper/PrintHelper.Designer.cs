namespace UsingPrintHelper
{
    partial class PrintHelper
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
            this.PrintButton1 = new System.Windows.Forms.Button();
            this.PrintButton2 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // PrintButton1
            // 
            this.PrintButton1.Location = new System.Drawing.Point(127, 162);
            this.PrintButton1.Name = "PrintButton1";
            this.PrintButton1.Size = new System.Drawing.Size(75, 23);
            this.PrintButton1.TabIndex = 0;
            this.PrintButton1.Text = "Aceptar";
            this.PrintButton1.UseVisualStyleBackColor = true;
            this.PrintButton1.Click += new System.EventHandler(this.PrintButton1_Click);
            // 
            // PrintButton2
            // 
            this.PrintButton2.Location = new System.Drawing.Point(256, 162);
            this.PrintButton2.Name = "PrintButton2";
            this.PrintButton2.Size = new System.Drawing.Size(75, 23);
            this.PrintButton2.TabIndex = 1;
            this.PrintButton2.Text = "Cancelar";
            this.PrintButton2.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(73, 50);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "label1";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(114, 47);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(265, 20);
            this.textBox1.TabIndex = 3;
            // 
            // PrintHelper
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(455, 211);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.PrintButton2);
            this.Controls.Add(this.PrintButton1);
            this.Name = "PrintHelper";
            this.Text = "PrintHelper";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button PrintButton1;
        private System.Windows.Forms.Button PrintButton2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBox1;
    }
}