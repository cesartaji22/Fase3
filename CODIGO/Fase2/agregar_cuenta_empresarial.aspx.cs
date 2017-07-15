using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_cuenta_empresarial : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int empresa = servicio.retornar_id_empresa(TextBox1.Text);

        servicio.agregar_cuenta_empresa(empresa, TextBox2.Text, Double.Parse(TextBox3.Text));

    }
}