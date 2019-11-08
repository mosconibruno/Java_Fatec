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
@WebServlet(name = "ServletFormulario", urlPatterns = {"/ServletForm"})
public class ServletFormulario extends HttpServlet {

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
            out.println("<title>Servlet Formulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Formulário</h1>");
            
            out.println("<form action='' method=''>");
            out.println("Nome: <input type=\"text\" name=\"txtNome\"><br/>");
            out.println("E-mail: <input type=\"text\" name=\"txtEmail\"><br/>");
            out.println("<br/><input type='submit' name='btnEnviar' value='Enviar dados'>");
            out.println("</form>");
            
            if (request.getParameter("txtNome") != null && 
                request.getParameter("txtNome").length() > 0 &&
                request.getParameter("txtEmail") != null && 
                request.getParameter("txtEmail").length() > 0){
                // recupera os valores informados
                String nome = request.getParameter("txtNome");
                String email = request.getParameter("txtEmail");
                // exibe mensagem de boas-vindas
                out.println(String.format("<br/>Olá, %s, seja bem-vindo!\n" + 
                            "Seu login é %s", nome, email));
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
