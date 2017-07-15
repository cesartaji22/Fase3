<%@ Page Language="C#" AutoEventWireup="true" CodeFile="saldo_cliente.aspx.cs" Inherits="saldo_cliente" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Saldo de clientes<br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="No Cuenta: "></asp:Label>
        <asp:DropDownList ID="DropDownList1" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <br />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Consultar" />
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Saldo : "></asp:Label>
        <asp:Label ID="Label3" runat="server" Text="."></asp:Label>
    
        <br />
    
    </div>
    </form>
</body>
</html>
