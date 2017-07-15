using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_cuenta : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        DropDownList1.Items.Add("MONETARIA");
        DropDownList1.Items.Add("AHORRO");
        DropDownList1.Items.Add("AHORRO FIJO");
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int recibir = servicio.retornar_idcliente(TextBox1.Text);

        if (recibir==0)
        {
            Response.Redirect("~/menu_atencion.aspx");

        } else
        {
            servicio.insertar_cuenta(recibir, TextBox2.Text, 
                DropDownList1.SelectedItem.ToString(), Double.Parse(TextBox3.Text));
        }


    }
}