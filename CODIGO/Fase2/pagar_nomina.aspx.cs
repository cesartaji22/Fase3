using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class pagar_nomina : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        String casa = Session["identificador"].ToString();
        int id = int.Parse(casa);
        String[] lista1 = servicio.informacion_nomina(id);
        String[] lista2 = servicio.mostrar_cuentas_empresas(id);

        for (int x = 0; x < lista1.Length; x++)
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

        int nomina = servicio.retornar_id_nomina(DropDownList1.SelectedItem.ToString());

        double saldo_nomina = servicio.retornar_saldo_nomina(nomina);
        double saldo_cuenta = servicio.retornar_saldo_empresa(DropDownList2.SelectedItem.ToString());

        if (saldo_cuenta>saldo_nomina)
        {
            // dinero que saldra de la cuenta de la empresa

            saldo_cuenta = saldo_cuenta - saldo_nomina;
            servicio.retiro_empresa(DropDownList2.SelectedItem.ToString(), saldo_cuenta);


            // depositos al empleado

            String[] estado = servicio.no_cuenta_saldo(nomina);
            

            for (int i = 0; i < estado.Length; i++)
            {
                String[] substrings = estado[i].Split('$');

                
                double saldo_anterior = servicio.retornal_saldo(substrings[0]);
                saldo_anterior = saldo_anterior + Double.Parse(substrings[1]);

                servicio.depositar(substrings[0], saldo_anterior);

                //// historial del empleado

                int cuenta = servicio.retornar_id_cuenta(substrings[0]);

                servicio.historial_cliente(cuenta, "2017-05-10",  TextBox1.Text,
                   Double.Parse(substrings[1]), 0, saldo_anterior);


            }

        }
    }





}