using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class cambiar_cheque : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {


        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        double saldo_anterior = servicio.retornal_saldo(TextBox1.Text);

        if (Double.Parse(TextBox2.Text) > saldo_anterior)
        {

        }
        else
        {
            saldo_anterior = saldo_anterior - Double.Parse(TextBox2.Text);
            servicio.retiro_monetario(TextBox1.Text, saldo_anterior);

            //para el historial
            int cuenta = servicio.retornar_id_cuenta(TextBox1.Text);

            servicio.historial_cliente(cuenta, "2017-05-10", "Cobro de cheque No. "+ TextBox3.Text + " de la cuenta No. "+ TextBox1.Text + " a nombre de: " + TextBox4.Text,
                0, Double.Parse(TextBox2.Text), saldo_anterior);

            /// puntos
            /// 

            int id = servicio.devoler_id_cliente_cuenta(TextBox1.Text);
            int puntotes = servicio.retornar_puntos(id);

            int puntes = int.Parse(TextBox2.Text) / 1000;
            puntes = puntes * 1500;
            puntotes = puntotes + puntes;

            servicio.insertar_puntos(id, puntotes);

            //historial de puntos

            servicio.historial_puntos(id, "2017-03-29", "Cobro de cheque No. " + TextBox3.Text + " de la cuenta No. " + TextBox1.Text, 
                puntes, 0, puntotes);

        }




    }
}