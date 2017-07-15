using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class asociar_cuentas : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int idCliente = servicio.retornar_idcliente(TextBox1.Text);

        int idCuenta = servicio.retornar_id_cuenta(TextBox2.Text);

        servicio.asociar_cuentas(idCliente, idCuenta);


    }
}