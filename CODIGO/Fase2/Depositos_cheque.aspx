<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Depositos_cheque.aspx.cs" Inherits="Depositos" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Depositos con cheque<br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="No de Cuenta del cheque: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        &nbsp;
        <br />
        <br />
&nbsp;<asp:Label ID="Label4" runat="server" Text="No. Cheque: "></asp:Label>
        <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="Nombre Cobrador: "></asp:Label>
        <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="No cuenta a depositar: "></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server" OnTextChanged="TextBox2_TextChanged"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Monto: "></asp:Label>
        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
        <br />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Depositar" />
        <br />
    
    </div>
    </form>
</body>
</html>
