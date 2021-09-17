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
    int cedula=Integer.parseInt(request.getParameter("cedula_usuario"));
    cli.setNombreUsuario(request.getParameter("nombre_usuario"));
    cli.setCedulaUsuario(cedula);    
    cli.setCorreoUsuario(request.getParameter("email_usuario"));
    cli.setUsuarioUsuario(request.getParameter("usuario"));
    cli.setContrasenaUsuario(request.getParameter("password"));
    cc.registrarUsuario(cli);
%>
<head>
<title>Page Redirection</title>
</head>
<body>
    <h1>Using GET Method to Read Form Data</h1>
    <ul>
        <li><p>
                <b>Cedula:</b>
                <%= request.getParameter("cedula_usuario")%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= request.getParameter("nombre_usuario")%>
            </p></li>
        <li><p>
                <b>Correo:</b>
                <%= request.getParameter("email_usuario")%>
            </p></li>
        <li><p>
                <b>Usuario:</b>
                <%= request.getParameter("usuario")%>
            </p></li>
        <li><p>
                <b>Contrasena:</b>
                <%= request.getParameter("password")%>
            </p></li>
    </ul>
</body>
</html>