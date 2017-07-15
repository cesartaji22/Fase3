using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Depositos : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        double saldo_cuenta_cheque = servicio.retornal_saldo(TextBox1.Text);
        double saldo_cuenta_final = servicio.retornal_saldo(TextBox2.Text);

        if (saldo_cuenta_cheque> Double.Parse(TextBox3.Text))
        {

            double saldoa = saldo_cuenta_cheque - Double.Parse(TextBox3.Text);
            servicio.retiro_monetario(TextBox1.Text, saldoa);

            double saldob = saldo_cuenta_final + Double.Parse(TextBox3.Text);
            servicio.depositar(TextBox2.Text, saldob);

            /// historial cambiar cheque
            int cuenta = servicio.retornar_id_cuenta(TextBox1.Text);

            servicio.historial_cliente(cuenta, "2017-05-10", "Cobro de cheque No. " + TextBox4.Text + " de la cuenta No. " + TextBox1.Text + " a nombre de: " + TextBox5.Text,
                0, Double.Parse(TextBox3.Text), saldoa);

            //// historial del deposito

            int cuen = servicio.retornar_id_cuenta(TextBox2.Text);

            servicio.historial_cliente(cuen, "2017-05-10", "Deposito de Cheque a cuenta No. " + TextBox2.Text,
             Double.Parse(TextBox3.Text), 0, saldob);

        }

        

    }

    protected void TextBox2_TextChanged(object sender, EventArgs e)
    {

    }
}