<%-- 
    Document   : index
    Created on : 31/08/2017, 04:00:26 PM
    Author     : SINFORMATICAA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <h1>Ingreso de Clientes</h1>
        
        <form action="ingreso.do" method="POST">
        
            <table border="0">
 
                <tbody>
                    <tr>
                        <td>Nit</td>
                        <td><input type="text" name="txtNit" value="" /> </td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" value="" /></td>
                    </tr>
                    <tr>
                        <td>Edad</td>
                        <td><input type="text" name="txtEdad" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="btnIngreso" value="Ingreso" /></td>
                    </tr>     

                    <tr>
                        <td> </td>
                        <td> </td>
                    </tr>                    
                    
                </tbody>
            </table>
        </form>    
 
        <!-- tenemos una nueva tabla -->
        <table border="0">
            <tbody>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Consulta" onclick = "location='consultar.do'"/></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
