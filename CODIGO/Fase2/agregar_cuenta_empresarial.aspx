<%@ Page Language="C#" AutoEventWireup="true" CodeFile="agregar_cuenta_empresarial.aspx.cs" Inherits="agregar_cuenta_empresarial" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Agregar Cuenta Empresarial"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Patente Empresa:"></asp:Label>
&nbsp;
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="No de Cuenta: "></asp:Label>
&nbsp;
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Saldo:"></asp:Label>
&nbsp;
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Agregar Cuenta" />
        <br />
    
    </div>
    </form>
</body>
</html>
