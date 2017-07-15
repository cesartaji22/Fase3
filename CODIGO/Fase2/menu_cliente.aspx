<%@ Page Language="C#" AutoEventWireup="true" CodeFile="menu_cliente.aspx.cs" Inherits="menu_cliente" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Menu de Clientes"></asp:Label>
    
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Consultar Saldo" />
        <br />
        <br />
        <asp:Button ID="Button2" runat="server" Text="Transferencias propias" OnClick="Button2_Click" />
        <br />
        <br />
        <asp:Button ID="Button3" runat="server" Text="Transferencias a terceros" OnClick="Button3_Click" />
        <br />
        <br />
        <asp:Button ID="Button4" runat="server" OnClick="Button4_Click" Text="Estado De Cuenta" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
    
    </div>
    </form>
</body>
</html>
