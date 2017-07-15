using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class transferencias_propias : System.Web.UI.Page
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
            DropDownList2.Items.Add(lista1[x]);
        }
    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        double saldo_cuenta_origen = servicio.retornal_saldo(DropDownList1.SelectedItem.ToString());
        double saldo_cuenta_final = servicio.retornal_saldo(DropDownList2.SelectedItem.ToString());

        if (saldo_cuenta_origen > Double.Parse(TextBox1.Text))
        {

            double saldoa = saldo_cuenta_origen - Double.Parse(TextBox1.Text);
            servicio.depositar(DropDownList1.SelectedItem.ToString(), saldoa);

            double saldob = saldo_cuenta_final + Double.Parse(TextBox1.Text);
            servicio.depositar(DropDownList2.SelectedItem.ToString(), saldob);

            ////// para el historial

            ///del retiro
            int cuentaa = servicio.retornar_id_cuenta(DropDownList1.SelectedItem.ToString());

            servicio.historial_cliente(cuentaa, "2017-05-10", "Retiro de la cuenta No. " + DropDownList1.SelectedItem.ToString() +", transaccion propia",
                0, Double.Parse(TextBox1.Text), saldoa);
            //// del deposito

            int cuentab = servicio.retornar_id_cuenta(DropDownList2.SelectedItem.ToString());

            servicio.historial_cliente(cuentab, "2017-05-10", "Deposito a la cuenta No. " + DropDownList2.SelectedItem.ToString() +", transaccion propia",
                Double.Parse(TextBox1.Text), 0, saldob);

        }


    }
}