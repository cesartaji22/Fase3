﻿<%@ Page Language="C#" AutoEventWireup="true" CodeFile="asociar_cuentas.aspx.cs" Inherits="asociar_cuentas" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Asociar Cuentas"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="DPI Cliente: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="No Cuenta a Asociarle: "></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Asociar" />
    
    </div>
    </form>
</body>
</html>
