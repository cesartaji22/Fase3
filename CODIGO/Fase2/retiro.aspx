<%@ Page Language="C#" AutoEventWireup="true" CodeFile="retiro.aspx.cs" Inherits="retiro" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <p>
            Retiro Monetario</p>
        <p>
            <br />
            <asp:Label ID="Label1" runat="server" Text="No de Cuenta: "></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
            <br />
            <asp:Label ID="Label2" runat="server" Text="Monto: "></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Retirar" />
        </p>
    <div>
    
    </div>
    </form>
</body>
</html>
