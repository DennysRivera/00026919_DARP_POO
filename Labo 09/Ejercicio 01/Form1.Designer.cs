namespace Ejercicio_01
{
    partial class Form1
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
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.buttonRegister = new System.Windows.Forms.Button();
            this.buttonAddSignature = new System.Windows.Forms.Button();
            this.buttonInscription = new System.Windows.Forms.Button();
            this.queryButton = new System.Windows.Forms.Button();
            this.registerStudent1 = new Ejercicio_01.RegisterStudent();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(
                new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.buttonRegister, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonAddSignature, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.buttonInscription, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.queryButton, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.registerStudent1, 0, 1);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 85F));
            this.tableLayoutPanel1.RowStyles.Add(
                new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 20F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(664, 473);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // buttonRegister
            // 
            this.buttonRegister.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonRegister.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.buttonRegister.Location = new System.Drawing.Point(3, 3);
            this.buttonRegister.Name = "buttonRegister";
            this.buttonRegister.Size = new System.Drawing.Size(160, 64);
            this.buttonRegister.TabIndex = 0;
            this.buttonRegister.Text = "Estudiante";
            this.buttonRegister.UseVisualStyleBackColor = true;
            this.buttonRegister.Click += new System.EventHandler(this.buttonRegister_Click);
            // 
            // buttonAddSignature
            // 
            this.buttonAddSignature.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonAddSignature.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.buttonAddSignature.Location = new System.Drawing.Point(169, 3);
            this.buttonAddSignature.Name = "buttonAddSignature";
            this.buttonAddSignature.Size = new System.Drawing.Size(160, 64);
            this.buttonAddSignature.TabIndex = 1;
            this.buttonAddSignature.Text = "Materia";
            this.buttonAddSignature.UseVisualStyleBackColor = true;
            this.buttonAddSignature.Click += new System.EventHandler(this.buttonAddSignature_Click);
            // 
            // buttonInscription
            // 
            this.buttonInscription.Dock = System.Windows.Forms.DockStyle.Fill;
            this.buttonInscription.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.buttonInscription.Location = new System.Drawing.Point(335, 3);
            this.buttonInscription.Name = "buttonInscription";
            this.buttonInscription.Size = new System.Drawing.Size(160, 64);
            this.buttonInscription.TabIndex = 2;
            this.buttonInscription.Text = "Inscripción";
            this.buttonInscription.UseVisualStyleBackColor = true;
            this.buttonInscription.Click += new System.EventHandler(this.buttonInscription_Click);
            // 
            // queryButton
            // 
            this.queryButton.Dock = System.Windows.Forms.DockStyle.Fill;
            this.queryButton.Font = new System.Drawing.Font("Segoe UI", 15.75F, System.Drawing.FontStyle.Regular,
                System.Drawing.GraphicsUnit.Point, ((byte) (0)));
            this.queryButton.Location = new System.Drawing.Point(501, 3);
            this.queryButton.Name = "queryButton";
            this.queryButton.Size = new System.Drawing.Size(160, 64);
            this.queryButton.TabIndex = 3;
            this.queryButton.Text = "Consultar";
            this.queryButton.UseVisualStyleBackColor = true;
            this.queryButton.Click += new System.EventHandler(this.queryButton_Click);
            // 
            // registerStudent1
            // 
            this.registerStudent1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.tableLayoutPanel1.SetColumnSpan(this.registerStudent1, 4);
            this.registerStudent1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.registerStudent1.Location = new System.Drawing.Point(3, 73);
            this.registerStudent1.Name = "registerStudent1";
            this.registerStudent1.Size = new System.Drawing.Size(658, 397);
            this.registerStudent1.TabIndex = 4;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(664, 473);
            this.Controls.Add(this.tableLayoutPanel1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private Ejercicio_01.RegisterStudent registerStudent1;
        private System.Windows.Forms.Button buttonRegister;
        private System.Windows.Forms.Button buttonAddSignature;
        private System.Windows.Forms.Button buttonInscription;
        private System.Windows.Forms.Button queryButton;
    }
}