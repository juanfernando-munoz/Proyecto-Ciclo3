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
    cli.setCedula(cedula);    
    cli.setCorreo(request.getParameter("correo"));
    cli.setUsuario(request.getParameter("usuario"));
    cli.setContrasena(request.getParameter("contrasena"));
    cc.registrarPersona(cli);
%>
<head>
<title>Page Redirection</title>
</head>
<body>
    <h1>Using GET Method to Read Form Data</h1>
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