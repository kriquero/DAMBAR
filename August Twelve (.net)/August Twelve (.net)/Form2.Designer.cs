namespace August_Twelve__.net_
{
    partial class linea
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(linea));
            this.label1 = new System.Windows.Forms.Label();
            this.btAdd = new System.Windows.Forms.Button();
            this.btDel = new System.Windows.Forms.Button();
            this.check = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(43, 29);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(0, 13);
            this.label1.TabIndex = 0;
            // 
            // btAdd
            // 
            this.btAdd.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.btAdd.Image = ((System.Drawing.Image)(resources.GetObject("btAdd.Image")));
            this.btAdd.Location = new System.Drawing.Point(12, 345);
            this.btAdd.Name = "btAdd";
            this.btAdd.Size = new System.Drawing.Size(60, 60);
            this.btAdd.TabIndex = 1;
            this.btAdd.UseVisualStyleBackColor = false;
            this.btAdd.Click += new System.EventHandler(this.btAdd_Click);
            // 
            // btDel
            // 
            this.btDel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.btDel.Image = ((System.Drawing.Image)(resources.GetObject("btDel.Image")));
            this.btDel.Location = new System.Drawing.Point(336, 345);
            this.btDel.Name = "btDel";
            this.btDel.Size = new System.Drawing.Size(60, 60);
            this.btDel.TabIndex = 4;
            this.btDel.UseVisualStyleBackColor = false;
            this.btDel.Click += new System.EventHandler(this.btDel_Click);
            // 
            // check
            // 
            this.check.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.check.ForeColor = System.Drawing.Color.Black;
            this.check.Image = ((System.Drawing.Image)(resources.GetObject("check.Image")));
            this.check.Location = new System.Drawing.Point(270, 345);
            this.check.Name = "check";
            this.check.Size = new System.Drawing.Size(60, 60);
            this.check.TabIndex = 5;
            this.check.UseVisualStyleBackColor = false;
            this.check.Click += new System.EventHandler(this.check_Click);
            // 
            // linea
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(408, 417);
            this.Controls.Add(this.check);
            this.Controls.Add(this.btDel);
            this.Controls.Add(this.btAdd);
            this.Controls.Add(this.label1);
            this.Name = "linea";
            this.Text = "Linea Comanda";
            this.Activated += new System.EventHandler(this.linea_Activated);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btAdd;
        private System.Windows.Forms.Button btDel;
        private System.Windows.Forms.Button check;
    }
}