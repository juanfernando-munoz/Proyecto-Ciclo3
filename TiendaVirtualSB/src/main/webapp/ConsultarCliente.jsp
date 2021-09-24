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
    cli.setCedulaCliente(cedula);    
    cc.consultarPersona(cli.getCedulaCliente());
%>
<head>
<title>Consultar Cliente</title>
</head>
<body>
    <h1>Informacion del Cliente:</h1>
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