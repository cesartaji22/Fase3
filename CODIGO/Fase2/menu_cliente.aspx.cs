using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class menu_cliente : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

        
        if (Session["Cuenta"].Equals("usuario_individual")) 
        {
            Label2.Text = "Cuante actual:  " + Session["identificador"];
            
        }
        else //En caso que la varibale de sesion no exista regresa al login
        {
            if (Session["Cuenta"].Equals("Gerente General"))
            {
                Response.Redirect("~/menu_gerente_general.aspx");
            }
            else if (Session["Cuenta"].Equals("Gerente de agencia"))
            {
                Response.Redirect("~/menu_gerente.aspx");
            }
            else if (Session["Cuenta"].Equals("Atención al Cliente"))
            {
                Response.Redirect("~/menu_atencion.aspx");
            }
            else if (Session["Cuenta"].Equals("Cajero"))
            {
                Response.Redirect("~/menu_cajeros.aspx");
            }

            else
            {
                Response.Redirect("~/login.aspx");
            }


        }




    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/saldo_cliente.aspx");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/transferencias_propias.aspx");
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/transferencias_terceros.aspx");
    }

    protected void Button4_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/estado_cuenta_cliente.aspx");
    }
}