using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_empleado : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        String [] lista1 = servicio.mostrar_tipo_trabajador();
        String[] lista2 = servicio.mostrar_agencias();

        for (int x=0; x<lista1.Length-1; x++)
        {
            DropDownList1.Items.Add(lista1[x]);
        }

        for (int x = 0; x < lista2.Length; x++)
        {
            DropDownList2.Items.Add(lista2[x]);
        }

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        servicio.agregar_trabajador(TextBox1.Text, TextBox2.Text, TextBox3.Text, TextBox4.Text,
            TextBox5.Text, TextBox6.Text, DropDownList1.SelectedItem.ToString(),
            DropDownList2.SelectedItem.ToString());
    }
}