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
    ClienteVO cli=new ClienteVO();
    int cedula=Integer.parseInt(request.getParameter("cedula"));
    int telefono=Integer.parseInt(request.getParameter("telefono"));
    cli.setCedulaCliente(cedula);
    cli.setDireccionCliente("direccion");
    cli.setEmailCliente("correo");
    cli.setNombreCliente("nombre");
    cli.setTelefonoCliente(telefono);
    cc.consultarCliente(cli.getCedulaCliente());
%>
<head>
<title>Consultar Cliente</title>
</head>
<body>
    <h1>Informacion del Cliente:</h1>
    <ul>
        <li><p>
                <b>Cedula:</b>
                <%= cli.getCedulaCliente() %>
            </p></li>
        <li><p>
                <b>Direccion:</b>
                <%= cli.getDireccionCliente()%>
            </p></li>
        <li><p>
                <b>Correo:</b>
                <%= cli.getEmailCliente()%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= cli.getNombreCliente()%>
            </p></li>
        <li><p>
                <b>Telefono:</b>
                <%= cli.getTelefonoCliente(request.getParameter("telefono")%>
            </p></li>
    </ul>
</body>
</html>