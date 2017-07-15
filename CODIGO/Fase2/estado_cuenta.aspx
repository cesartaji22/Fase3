<%@ Page Language="C#" AutoEventWireup="true" CodeFile="estado_cuenta.aspx.cs" Inherits="estado_cuenta" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <p style="height: 23px">
            Reactivar o Suspender cuenta</p>
        <p style="height: 41px">
            <asp:Label ID="Label1" runat="server" Text="No Cuenta: "></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </p>
        <p style="height: 34px">
            <asp:Label ID="Label2" runat="server" Text="Estado :"></asp:Label>
&nbsp;<asp:DropDownList ID="DropDownList1" runat="server">
            </asp:DropDownList>
        </p>
        <p style="height: 113px">
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Button" />
        </p>
    </form>
</body>
</html>
