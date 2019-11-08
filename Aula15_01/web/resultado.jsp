<%-- 
    Document   : resultado
    Created on : 13/11/2018, 23:36:20
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
        <h1>Resultado</h1>
        <h3> Ola,  <%= request.getParameter("nome") %> ! </h3>
        <h3> Nome maiusculo: <%= request.getAttribute("maiusculo").toString() %> </h3>
    </body>
</html>
