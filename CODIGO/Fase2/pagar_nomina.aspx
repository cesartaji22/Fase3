<%@ Page Language="C#" AutoEventWireup="true" CodeFile="pagar_nomina.aspx.cs" Inherits="pagar_nomina" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Label ID="Label1" runat="server" Text="Pagar Nomina"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="No. Nomina"></asp:Label>
&nbsp;<asp:DropDownList ID="DropDownList1" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="No. Cuenta"></asp:Label>
&nbsp;
        <asp:DropDownList ID="DropDownList2" runat="server">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Motivo: "></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Pagar Nomina" />
        <br />
        <br />
        <asp:Label ID="Label5" runat="server" Text="Label"></asp:Label>
        <br />
    
    </div>
    </form>
</body>
</html>
