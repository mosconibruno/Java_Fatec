<%-- 
    Document   : index
    Created on : 06/11/2018, 20:17:52
    Author     : lab1
--%>

<%@page import="negocio.Calculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora JSP</title>
    </head>
    <body>
        <h1>Calculadora JSP</h1>
        <form action='' method='get' n1='formN'>
           Insira o primeiro numero <input type="number" name="number1"><br/>
           Insira o segundo numero <input type="number" name="number2"><br/><br/>
           <input type='submit' name='btnSomar' value='Somar'>
            <input type='submit' name='btnSubtrair' value='Subtrair'>
            <input type='submit' name='btnMultiplicar' value='Multiplicar'>
            <input type='submit' name='btnDividir' value='Dividir'>
            </form>
        <% if(request.getParameter("number1") != null && request.getParameter("number2") != null){
            
            float fa, fb;
            fa = Float.parseFloat(request.getParameter("number1"));
            fb = Float.parseFloat(request.getParameter("number2")); 
            Calculo c = new Calculo(fa,fb);    
           
            if(request.getParameter("btnSomar") != null){
                   c.somar();      
        } 

         if(request.getParameter("btnSubtrair") != null){
                    c.subtrair();
                    
        } 

         if(request.getParameter("btnMultiplicar") != null){
                    c.multiplicar();
                    
        }            
         if(request.getParameter("btnDividir") != null){
                    c.dividir();
                    
 } %> <br> <%
            out.println("Resultado: " + c.getC());
        }
            
        %>
    </body>
</html>
