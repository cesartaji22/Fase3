<%@ Page Language="C#" AutoEventWireup="true" CodeFile="menu_empresa.aspx.cs" Inherits="menu_empresa" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Menú Empresa"></asp:Label>
    
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Agregar Empleados a nomina" />
        <br />
        <br />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Pagar Nominas" />
        <br />
        <br />
        <br />
    
    </div>
    </form>
</body>
</html>
