using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_cliente : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
        

    protected void Button1_Click(object sender, EventArgs e)
    {

       

        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();
        servicio.ingresar_clientes(TextBox1.Text, TextBox2.Text, TextBox3.Text, TextBox4.Text, TextBox5.Text, TextBox6.Text);


    }

    protected void Calendar1_SelectionChanged(object sender, EventArgs e)
    {

    }
}