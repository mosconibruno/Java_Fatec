/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Figura;
import negocio.Retangulo;
import negocio.Triangulo;

/**
 *
 * @author lab1
 */
@WebServlet(name = "servletFigura", urlPatterns = {"/servletFigura"})
public class servletFigura extends HttpServlet {

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
            out.println("<title>Servlet Page</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora de Área e Perímetro (Servlet) </h1>");
            
            float base = Float.parseFloat(request.getParameter("valorBase"));
            float altura = Float.parseFloat(request.getParameter("valorAltura"));
         
            Retangulo objRetangulo = new Retangulo();
            objRetangulo.calcularArea(base, altura);
            objRetangulo.calcularPerimetro(base, altura);
            
            Triangulo objTriangulo = new Triangulo();
            objTriangulo.calcularArea(base, altura);
            objTriangulo.calcularPerimetro(base, altura);
            
            RequestDispatcher rd = request.getRequestDispatcher("exibeResultado.jsp");
            request.setAttribute("areaRet", objRetangulo.getArea());
            request.setAttribute("perimetroRet", objRetangulo.getPerimetro());
            request.setAttribute("areaTri", objTriangulo.getArea());
            request.setAttribute("perimetroTri", objTriangulo.getPerimetro());
            rd.forward(request, response);
            

            

            
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
