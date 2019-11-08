<%-- 
    Document   : index
    Created on : 13/11/2018, 23:54:05
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
        <h1>JSP e Servlet </h1>
        
        <form action="ServletTrataTexto" method="post">
            Informe seu nome: <input type='text' name='nome'><br><br>
            <input type='submit' name="btnConverter" value="Converter para Maiusculo">
            <input type='submit' name="btnConverter" value="Converter para Minusculo">
        </form>
        
        <% if(request.getAttribute("texto") != null ) {
        %> <h3> O texto convertido é: <%= request.getAttribute("texto").toString() %> </h3>
        <% } %>
        
    </body>
</html>
