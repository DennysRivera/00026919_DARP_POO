using System;
using System.Windows.Forms;

namespace Ejercicio_01
{
    public partial class Form1 : Form
    {
        private UserControl current = null;
        public Form1()
        {
            InitializeComponent();
            current = registerStudent1;
        }

        private void buttonRegister_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            current = new RegisterStudent();
            tableLayoutPanel1.Controls.Add(current, 0, 1);
            tableLayoutPanel1.SetColumnSpan(current, 4);
        }

        private void buttonAddSignature_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            current = new AddSignature();
            tableLayoutPanel1.Controls.Add(current, 0, 1);
            tableLayoutPanel1.SetColumnSpan(current, 4);
        }

        private void buttonInscription_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            current = new Inscription();
            tableLayoutPanel1.Controls.Add(current, 0, 1);
            tableLayoutPanel1.SetColumnSpan(current, 4);
        }

        private void queryButton_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            current = new ViewData();
            tableLayoutPanel1.Controls.Add(current, 0, 1);
            tableLayoutPanel1.SetColumnSpan(current, 4);
        }
    }
}