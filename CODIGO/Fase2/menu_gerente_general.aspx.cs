using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class menu_gerente_general : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {


        if (Session["Cuenta"].Equals("Gerente General"))
        {
           // Label2.Text = "Cuante actual:  " + Session["identificador"];
            //Label1.Text = "Cuante actual: " + Session["Cuenta"];
        }
        else //En caso que la varibale de sesion no exista regresa al login
        {
            Response.Redirect("~/Login.aspx");

        }


    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_empleado.aspx");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_agencia.aspx");
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/quitar_gerente.aspx");
    }

    protected void Button4_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_proveedor.aspx");
    }

    protected void Button5_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_producto.aspx");
    }
}