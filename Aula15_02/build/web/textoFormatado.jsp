<%-- 
    Document   : textoFormatado
    Created on : 14/11/2018, 00:21:13
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
        <h1>JSP Texto Formatado</h1>
        <h3> O texto convertido é: <%= request.getAttribute("texto").toString()%>  </h3>
    </body>
</html>
