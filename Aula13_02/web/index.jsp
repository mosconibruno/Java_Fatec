<%-- 
    Document   : index
    Created on : 30/10/2018, 21:48:14
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println("<h3>Capturando a data atual:</h3>");
            Date data = new Date();
        %>
        Agora são (via scriptlet):
        <%
            out.println(String.valueOf(data));
        %> 
        <br>Agora são (via expressão scriptlet): <%= data %>
    </body>
</html>
