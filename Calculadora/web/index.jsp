<%-- 
    Document   : Calculator
    Created on : Oct 12, 2018, 7:29:39 PM
    Author     : Jambler Alejandro Arteaga 0900-14-6964
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <form method="POST" action="resultCalculator">
            <center>
                <div style="border: 2px solid #000000;width: 30%; background-color: #f0f8ff">
                    <h1>Calculadora</h1>
                    <div>
                        <div>
                            <input type="text" name="number1" style="margin: 10px;"/>
                            <br>
                            <input type="text" name="number2" style="margin: 10px;"/>
                            <br>
                            <select name="operation" style="margin: 10px;">
                                <option value="suma">Suma</option>
                                <option value="resta">Resta</option>
                                <option value="multiplicacion">Multiplicar</option>
                                <option value="division">Dividir</option>
                            </select>
                            <br>
                            <button style="margin: 10px;">Calcular</button>
                        </div>
                    </div>
                </div>
            </center>
        </form>
    </body>
</html>
