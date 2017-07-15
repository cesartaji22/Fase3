<%@ Page Language="C#" AutoEventWireup="true" CodeFile="cambiar_asignacion.aspx.cs" Inherits="cambiar_asignacion" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Cambiar asignacion:<br />
        <br />
        <asp:Label ID="Label1" runat="server" Text="CUI: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="Cambiar a :"></asp:Label>
        <asp:DropDownList ID="DropDownList1" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Cambiar" />
    
    </div>
    </form>
</body>
</html>
