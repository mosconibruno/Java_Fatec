<%-- 
    Document   : exibeResultado
    Created on : 27/11/2018, 19:51:13
    Author     : lab1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado Calculadora de Área e Perímetro (JSP II)</h1><br>
        <h3>Área do Retangulo: <%= request.getAttribute("areaRet").toString() %></h3><br>
        <h3>Perímetro do Retangulo: <%= request.getAttribute("perimetroRet").toString() %></h3><br>
        <h3>Área do Triangulo: <%= request.getAttribute("areaTri").toString() %></h3><br>
        <h3>Perímetro do Triangulo: <%= request.getAttribute("perimetroTri").toString() %></h3><br>
        
    </body>
</html>
