<%-- 
    Document   : index
    Created on : 27/11/2018, 21:27:33
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP com Servlet para cálculo de figuras</title>
    </head>
    <body>
        <h1>JSP com Servlet para cálculo de figuras</h1>
        
        <form action="ServletFigura">
            Base: <input type="text" name="base"><br>
            Altura: <input type="text" name="altura"><br><br>
            <input type="submit" value="Calcular área e perímetro das figuras">
        </form>        
    </body>
</html>
