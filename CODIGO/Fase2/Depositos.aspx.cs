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

        double saldo_anterior = servicio.retornal_saldo(TextBox1.Text);

        saldo_anterior = saldo_anterior + Double.Parse(TextBox2.Text);

        servicio.depositar(TextBox1.Text, saldo_anterior);

        //esto es para el historial

        int cuenta = servicio.retornar_id_cuenta(TextBox1.Text);

        servicio.historial_cliente(cuenta, "2017-05-10", "Deposito en efectivo en cuenta No. "+ TextBox1.Text,
            Double.Parse(TextBox2.Text), 0, saldo_anterior);

        /// puntos
        /// 

        int id = servicio.devoler_id_cliente_cuenta(TextBox1.Text);
        int puntotes = servicio.retornar_puntos(id);

        int puntes = int.Parse(TextBox2.Text)/500;
        puntes = puntes * 1000;
        puntotes = puntotes + puntes;

        servicio.insertar_puntos(id, puntotes);

        //historial de puntos

        servicio.historial_puntos(id, "2017-05-10", "Deposito en efectivo en cuenta No. " + TextBox1.Text,
            puntes, 0, puntotes);

    }
}