/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Calculo;

/**
 *
 * @author lab1
 */
@WebServlet(name = "ServletCalculadora", urlPatterns = {"/ServletCalculadora"})
public class ServletCalculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Calculadora</h1>");
            out.println("<form action='' method='get' n1='formN'>");
            out.println("Primeiro numero: <input type=\"number\" name=\"number1\"><br/>");
            out.println("Segundo numero: <input type=\"number\" name=\"number2\"><br/>");
            out.println("<input type='submit' name='btnSomar' value='Somar'>");
            out.println("<input type='submit' name='btnSubtrair' value='Subtrair'>");
            out.println("<input type='submit' name='btnMultiplicar' value='Multiplicar'>");
            out.println("<input type='submit' name='btnDividir' value='Dividir'>");
            out.println("</form>");
            
        

        if(request.getParameter("btnSomar") != null){
            Calculo c = new Calculo();
            String b = request.getParameter("number1");
            float fb = Float.parseFloat(b);
            String d = request.getParameter("number2");
            float fd = Float.parseFloat(d);
            float a = c.somar(fb, fd);
            out.println("Resultado: "+a);
        }
        if(request.getParameter("btnSubtrair") != null){
            Calculo c = new Calculo();
            String b = request.getParameter("number1");
            float fb = Float.parseFloat(b);
            String d = request.getParameter("number2");
            float fd = Float.parseFloat(d);
            float a = c.subtrair(fb, fd);
            out.println("Resultado: "+a);
        }
        if(request.getParameter("btnMultiplicar") != null){
            Calculo c = new Calculo();
            String b = request.getParameter("number1");
            float fb = Float.parseFloat(b);
            String d = request.getParameter("number2");
            float fd = Float.parseFloat(d);
            float a = c.multiplicar(fb, fd);
            out.println("Resultado: "+a);
        }
        if(request.getParameter("btnDividir") != null){
            Calculo c = new Calculo();
            String b = request.getParameter("number1");
            float fb = Float.parseFloat(b);
            String d = request.getParameter("number2");
            float fd = Float.parseFloat(d);
            float a = c.dividir(fb, fd);
            out.println("Resultado: "+a);
        }
            
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
