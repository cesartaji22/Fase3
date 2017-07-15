<%@ Page Language="C#" AutoEventWireup="true" CodeFile="quitar_gerente.aspx.cs" Inherits="cambiar_asignacion" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Quitar Gerente:<br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="CUI: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Cambiar" />
    
    </div>
    </form>
</body>
</html>
