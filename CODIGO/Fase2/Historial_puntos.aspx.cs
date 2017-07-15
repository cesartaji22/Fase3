using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Historial_puntos : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();
        int cliente = servicio.retornar_idcliente(TextBox1.Text);

        String[] estado = servicio.ver_historial_puntos(cliente);

        Table1.BorderWidth = 12;
        Table1.BorderStyle = BorderStyle.Ridge;
        Table1.GridLines = GridLines.Both;


        TableCell c1 = new TableCell();
        c1.Text = "FECHA";

        TableCell c2 = new TableCell();
        c2.Text = "CONCEPTO";

        TableCell c3 = new TableCell();
        c3.Text = "GANADOS";

        TableCell c4 = new TableCell();
        c4.Text = "COBRADOS";

        TableCell c5 = new TableCell();
        c5.Text = "PUNTOS";


        TableRow row = new TableRow();
        row.Controls.Add(c1);
        row.Controls.Add(c2);
        row.Controls.Add(c3);
        row.Controls.Add(c4);
        row.Controls.Add(c5);

        Table1.Controls.Add(row);

        for (int i = 0; i < estado.Length; i++)
        {
            String[] substrings = estado[i].Split('$');


            TableCell d1 = new TableCell();
            d1.Text = substrings[0];

            TableCell d2 = new TableCell();
            d2.Text = substrings[1];

            TableCell d3 = new TableCell();
            d3.Text = substrings[2];

            TableCell d4 = new TableCell();
            d4.Text = substrings[3];

            TableCell d5 = new TableCell();
            d5.Text = substrings[4];

            TableRow row2 = new TableRow();
            row2.Controls.Add(d1);
            row2.Controls.Add(d2);
            row2.Controls.Add(d3);
            row2.Controls.Add(d4);
            row2.Controls.Add(d5);

            Table1.Controls.Add(row2);
        }

    }
}