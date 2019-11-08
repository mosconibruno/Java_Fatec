<%-- 
    Document   : exibeResultado
    Created on : 04/12/2018, 20:34:43
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
        <h3>Perímetro do Triangulo: <%= request.getAttribute("perimetroTri").toString() %></h3><br><br>

        <h3>Curso: ADS , Período: Noturno, Nome: Bruno Mosconi Santos</h3>
        
    </body>
    
    
</html>
