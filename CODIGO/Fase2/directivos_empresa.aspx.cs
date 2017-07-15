using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class directivos_empresa : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        DropDownList1.Items.Add("PRESIDENTE");
        DropDownList1.Items.Add("VICE-PRESIDENTE");
        DropDownList1.Items.Add("TESORERO");

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int empresa = servicio.retornar_id_empresa(TextBox1.Text);
        int directivo = servicio.retornar_idcliente(TextBox2.Text);

        servicio.agregar_personal_empresa(empresa, directivo, DropDownList1.SelectedItem.ToString());
    }
}