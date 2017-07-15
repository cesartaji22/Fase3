<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Historial_puntos.aspx.cs" Inherits="Historial_puntos" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Historial Puntos Obtenidos"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="CUI"></asp:Label>
&nbsp;<asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Consultar" />
        <br />
        <asp:Table ID="Table1" runat="server">
        </asp:Table>
    
    </div>
    </form>
</body>
</html>
