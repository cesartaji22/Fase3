using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_agencia : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        servicio.agregar_agencias(TextBox1.Text, TextBox2.Text, TextBox3.Text, TextBox4.Text);
    }
}