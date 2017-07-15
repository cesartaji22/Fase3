<%@ Page Language="C#" AutoEventWireup="true" CodeFile="menu_atencion.aspx.cs" Inherits="menu_atencion" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Menu Atencion Al cliente<br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Agregar_cliente" />
        <br />
        <br />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Crear Cuenta individual" />
        <br />
        <br />
        <asp:Button ID="Button3" runat="server" OnClick="Button3_Click" Text="Suspender / Activar" />
        <br />
        <br />
        <asp:Button ID="Button4" runat="server" OnClick="Button4_Click" Text="Solicitar prestamo" />
        <br />
        <br />
        <asp:Button ID="Button5" runat="server" OnClick="Button5_Click" Text="Asociar Cuenta" />
        <br />
        <br />
        <asp:Button ID="Button6" runat="server" OnClick="Button6_Click" Text="Agregar Cliente Empresa" />
        <br />
        <br />
        <asp:Button ID="Button7" runat="server" OnClick="Button7_Click" Text="Agregar Directivos a Empresa" />
        <br />
        <br />
        <asp:Button ID="Button8" runat="server" OnClick="Button8_Click" Text="Crear Cuenta Empresarial" />
        <br />
        <br />
        <asp:Button ID="Button10" runat="server" OnClick="Button10_Click" Text="Crear Nominas" />
        <br />
        <br />
        <asp:Button ID="Button9" runat="server" OnClick="Button9_Click" Text="Ver Historial de Puntos" />
        <br />
        <br />
    
    </div>
    </form>
</body>
</html>
