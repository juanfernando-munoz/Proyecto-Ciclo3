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
    cli.setNombreCliente(request.getParameter("nombre"));
    cli.setCedulaCliente(cedula);    
    cli.setCorreoCliente(request.getParameter("correo"));
    cli.setUsuarioCliente(request.getParameter("usuario"));
    cli.setContrasenaCliente(request.getParameter("contrasena"));
    cc.modificarPersona(cli);
%>
<head>
<title>Actualizar Cliente</title>
</head>
<body>
    <h1>Cliente Actualizado!</h1>
    <ul>
        <li><p>
                <b>Cedula:</b>
                <%= request.getParameter("cedula")%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= request.getParameter("nombre")%>
            </p></li>
        <li><p>
                <b>Correo:</b>
                <%= request.getParameter("correo")%>
            </p></li>
        <li><p>
                <b>Usuario:</b>
                <%= request.getParameter("usuario")%>
            </p></li>
        <li><p>
                <b>Contrasena:</b>
                <%= request.getParameter("contrasena")%>
            </p></li>
    </ul>
</body>
</html>