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
    int telefono=Integer.parseInt(request.getParameter("telefono"));
    cli.setNit(nit);   
    cli.setTelefonoProveedor(telefono);
    cli.setNombreProveedor(request.getParameter("nombre"));
    cli.setCiudadProveedor(request.getParameter("ciudad"));
    cli.setDireccionProveedor(request.getParameter("direccion"));
    cc.modificarProveedor(cli);
%>
<head>
<title>Page Redirection</title>
</head>
<body>
    <h1>Proveedor Actualizado</h1>
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