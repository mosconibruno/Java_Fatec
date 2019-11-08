<%-- 
    Document   : index
    Created on : 27/11/2018, 19:50:47
    Author     : lab1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página JSP</title>
    </head>
    <body>
        <h1>Calculadora de Área e Perímetro (JSP) </h1>
        
        <form action='servletFigura' method='post'>
            Valor Base: <input type='text' name='valorBase'>&nbsp;
            Valor Altura: <input type='text' name='valorAltura'><br><br>
            <input type='submit' name='btnCalcular' value='Calcular'>
        </form>
    </body>
</html>
