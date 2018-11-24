<%-- 
    Document   : consulta
    Created on : 8/09/2017, 11:57:15 AM
    Author     : SINFORMATICAA
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Cliente"%>
<%
    ArrayList<Cliente>  clientes = (ArrayList<Cliente>) request.getSession().getAttribute("clientes");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Cliente</title>
    </head>
    <body>
        <h1>Muestra Clientes</h1>
        <%
           for(int i=0; i < clientes.size(); i++) {
               out.println("<p>Nombre: "+clientes.get(i).getNombre() +"</p>");
        }
        %>
    </body>
</html>
