<%-- 
    Document   : index
    Created on : 04/12/2018, 20:31:20
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
        <h1>JSP com Servlet para cálculo de figuras</h1>
        
        <form action='servletFigura' method='post'>
            Valor Base: <input type='number' name='valorBase' required min="1">&nbsp;
            Valor Altura: <input type='number' name='valorAltura' required min="1"><br><br>
            <input type='submit' name='btnCalcular' value='Calcular'>
        </form>

        <h3>Curso: ADS , Período: Noturno, Nome: Bruno Mosconi Santos</h3>
    </body>
</html>       
      

