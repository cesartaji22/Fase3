using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class empleado_nomina : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        String casa = Session["identificador"].ToString();
        int id = int.Parse(casa);
        String[] lista1 = servicio.informacion_nomina(id);


        for (int x = 0; x < lista1.Length; x++)
        {
            DropDownList1.Items.Add(lista1[x]);
        }

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int nomina = servicio.retornar_id_nomina(DropDownList1.SelectedItem.ToString());
        int cuenta = servicio.retornar_id_cuenta(TextBox1.Text);

        servicio.agregar_empleado_nomina(nomina, cuenta, Double.Parse(TextBox2.Text));

    }
}