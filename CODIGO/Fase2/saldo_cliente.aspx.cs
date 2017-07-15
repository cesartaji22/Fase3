using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class saldo_cliente : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        String casa = Session["identificador"].ToString();
        int id = int.Parse(casa);
        String[] lista1 = servicio.mostrar_cuentas(id);        

        for (int x = 0; x < lista1.Length; x++)
        {
            DropDownList1.Items.Add(lista1[x]);
        }

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();
        Label3.Text = servicio.retornal_saldo(DropDownList1.SelectedItem.ToString())+"";
    }
}