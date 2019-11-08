<%-- 
    Document   : exibeResultado
    Created on : 27/11/2018, 21:31:46
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado de área e perímetro das figuras</title>
    </head>
    <body>
        <h2>Resultado de área e perímetro das figuras</h2>
        <br>
        <!-- recupera os valores via expressão scriptlet -->
        <h3>Área do Retângulo: <%= request.getAttribute("areaRet").toString() %></h3>
        <h3>Perímetro do Retângulo: <%= request.getAttribute("perimetroRet").toString() %></h3>
        <h3>Área do Triângulo: <%= request.getAttribute("areaTri").toString() %></h3>
        <h3>Perímetro do Triângulo: <%= request.getAttribute("perimetroTri").toString() %></h3>
                
    </body>
</html>
