<%-- 
    Document   : error
    Created on : 5/09/2017, 02:41:09 PM
    Author     : SINFORMATICAA
--%>
<%
    String error = (String)request.getSession().getAttribute("error");
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hubo un error: <%=error%></h1>
    </body>
</html>
