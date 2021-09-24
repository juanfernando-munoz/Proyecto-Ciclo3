<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaVirtualSB.*,
        com.DTO.TiendaVirtualSB.*"
%>
<html>
<% 
    ClienteController cc=new ClienteController();
	ProveedorVO cli= new ProveedorVO();
    int nit=Integer.parseInt(request.getParameter("nit"));
    cli.setNit(nit);   
    cc.eliminarProveedor(cli);
%>
<head>
<title>Page Redirection</title>
</head>
<body>
    <h1>Proveedor Eliminado</h1>
    <ul>
        <li><p>
                <b>Nit:</b>
                <%= request.getParameter("nit")%>
            </p></li>
        <li><p>
                <b>Ciudad:</b>
                <%= request.getParameter("ciudad")%>
            </p></li>
        <li><p>
                <b>Direccion:</b>
                <%= request.getParameter("direccion")%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= request.getParameter("nombre")%>
            </p></li>
        <li><p>
                <b>Telefono:</b>
                <%= request.getParameter("telefono")%>
            </p></li>
    </ul>
</body>
</html>