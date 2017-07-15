using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class prestamo : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        String[] lista1 = servicio.modalidad_pago();

        for (int x = 0; x < lista1.Length; x++)
        {
            DropDownList1.Items.Add(lista1[x]);
        }
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int recibir = servicio.retornar_id_cuenta(TextBox1.Text);
        servicio.solicitar_prestamo(recibir, DropDownList1.SelectedItem.ToString(), Double.Parse(TextBox2.Text));
    }
}