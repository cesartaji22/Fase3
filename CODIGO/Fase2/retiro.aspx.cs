using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class retiro : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        double saldo_anterior = servicio.retornal_saldo(TextBox1.Text);

        if (Double.Parse(TextBox2.Text)>saldo_anterior)
        {
            
        }
        else
        {
            saldo_anterior = saldo_anterior - Double.Parse(TextBox2.Text);
            servicio.retiro_ahorros(TextBox1.Text, saldo_anterior);

            //historial
            int cuenta = servicio.retornar_id_cuenta(TextBox1.Text);

            servicio.historial_cliente(cuenta, "2017-05-10", "Retiro en efectivo de la cuenta No. "+TextBox1.Text,
                0, Double.Parse(TextBox2.Text), saldo_anterior);


        }
        
    }
}