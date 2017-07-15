using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Threading;

public partial class login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        //DropDownList1.Items.Clear();
        DropDownList1.Items.Add("Usuario individual");
        DropDownList1.Items.Add("Empleado");
        DropDownList1.Items.Add("Usuario empresarial");
    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        String tipo_user = DropDownList1.SelectedItem.ToString();
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        if (tipo_user.Equals("Usuario individual"))
        {
            

            String id = servicio.login(TextBox1.Text, TextBox2.Text);
            
            if (id.Equals("0"))
            {
                Label3.Text = "Datos incorrectos";
                for (int i=0; i<2;i++)
                {
                    Thread.Sleep(2000);
                }
                Response.Redirect("~/login.aspx");
            }
            else
            {

                Session["identificador"] = id;
                Session["Cuenta"] = "usuario_individual";
                Response.Redirect("~/menu_cliente.aspx");
                
            }


        } else if (tipo_user.Equals("Empleado"))
        {

            String recibo = servicio.login_trabajador(TextBox1.Text, TextBox2.Text);
            String[] substrings = recibo.Split(',');

            if (substrings[0].Equals("0"))
            {
                Label3.Text = "Datos incorrectos";
                for (int i = 0; i < 2; i++)
                {
                    Thread.Sleep(2000);
                }
                Response.Redirect("~/login.aspx");
            }
            else
            {

                Session["identificador"] = substrings[0];
                Session["Cuenta"] = substrings[1];

                if (substrings[1].Equals("Gerente General")) {
                    Response.Redirect("~/menu_gerente_general.aspx");
                }
                else if (substrings[1].Equals("Gerente de agencia")) {
                    Response.Redirect("~/menu_gerente.aspx");
                }
                else if (substrings[1].Equals("Atención al Cliente")) {
                    Response.Redirect("~/menu_atencion.aspx");
                }
                else
                {
                    Response.Redirect("~/menu_cajeros.aspx");
                }

            }

        }
        else
        {

            String id = servicio.login(TextBox1.Text, TextBox2.Text);

            if (id.Equals("0"))
            {
                Label3.Text = "Datos incorrectos";
                for (int i = 0; i < 2; i++)
                {
                    Thread.Sleep(2000);
                }
                Response.Redirect("~/login.aspx");
            }
            else
            {

                int empresa = servicio.login_empresa(int.Parse(id));

                if (empresa==0) {
                    Label3.Text = "Datos incorrectos";
                    for (int i = 0; i < 2; i++)
                    {
                        Thread.Sleep(2000);
                    }
                    Response.Redirect("~/login.aspx");

                }
                else
                {
                    Session["identificador"] = empresa;
                    Session["Cuenta"] = "usuario_empresa";
                    Response.Redirect("~/menu_empresa.aspx");
                }
                


            }

        }






    }
}