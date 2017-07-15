using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class agregar_producto : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        String archivo = "";

        if (FileUpload1.HasFile)
        {

            String savePath = @"C:\Users\TAJI\Desktop\Nueva carpeta (2)\productos\";
            string fullPath =  FileUpload1.FileName;
             archivo = savePath+fullPath;

        }


        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        int idcliente = servicio.retornar_id_proveedor(TextBox1.Text);

        servicio.agregar_producto(idcliente, TextBox2.Text, TextBox3.Text, int.Parse(TextBox4.Text), int.Parse(TextBox5.Text), archivo, TextBox6.Text);

    }
}