<%-- 
    Document   : index
    Created on : 06/11/2018, 21:44:00
    Author     : lab1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor JSP</title>
    </head>
    <body>
        <h1>Conversor JSP</h1>
        <form action='ConversaoDeMassa' method='get'>
            Massa original: <input type='text' name='massaOriginal'><br><br>
            <input type='submit' name='btnConverter' value='de lb para kg'>&nbsp
            <input type='submit' name='btnConverter' value='de kg para lb'>
            </form>
    </body>
</html>
