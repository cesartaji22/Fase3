﻿<%@ Page Language="C#" AutoEventWireup="true" CodeFile="transferencias_propias.aspx.cs" Inherits="transferencias_propias" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <asp:Label ID="Label1" runat="server" Text="Transacciones propias"></asp:Label>
        <br />
        <br />
&nbsp;<asp:Label ID="Label3" runat="server" Text="Cuenta Origen: "></asp:Label>
&nbsp;<asp:DropDownList ID="DropDownList1" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Cuenta Destino: "></asp:Label>
        <asp:DropDownList ID="DropDownList2" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Monto"></asp:Label>
&nbsp;<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Transferir" />
        <br />
    <div>
    
    </div>
    </form>
</body>
</html>
