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

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletTrataTexto", urlPatterns = {"/TrataTexto"})
public class ServletTrataTexto extends HttpServlet {

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
            out.println("<title>Servlet para Tratamento de Texto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet para tratamento de texto</h1>");
            
            out.println("<form action='' method='get' name='formTexto'>");
            out.println("Informe um texto qualquer: <input type='text' name='texto'><br><br>");
            out.println("<input type='submit' value='Tratar texto'>");
            out.println("</form>");
            
            if (request.getParameter("texto") != null &&
                request.getParameter("texto").length() > 0){
                // recupera o texto original e o repassa às funções para tratamento
                String textoOriginal =request.getParameter("texto");
                String textoMaiusculo = retornarMaiusculo(textoOriginal);
                String textoMinusculo = retornarMinusculo(textoOriginal);
                
                // exibe o texto original e os textos formatados
                out.println(String.format("Texto original: %s <br>", textoOriginal));
                out.println(String.format("Texto maiúsculo: %s <br>", textoMaiusculo));
                out.println(String.format("Texto minúsculo: %s ", textoMinusculo));
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public String retornarMaiusculo(String a){
        a = a.toUpperCase();
        return a;        
    }
    
    public String retornarMinusculo(String a){
        a = a.toLowerCase();
        return a; 
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
