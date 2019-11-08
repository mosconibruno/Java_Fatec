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
import negocio.Retangulo;
import negocio.Triangulo;

/**
 *
 * @author dreis
 */
@WebServlet(name = "ServletFigura", urlPatterns = {"/ServletFigura"})
public class ServletFigura extends HttpServlet {

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
            out.println("<title>ServletFigura</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ServletFigura</h1>");
            
            float base, altura;
            // recebe os valores informados na "index.jsp"
            base = Float.parseFloat(request.getParameter("base"));
            altura = Float.parseFloat(request.getParameter("altura"));
            // instancia objeto da classe Retangulo
            Retangulo objRet = new Retangulo();
            // calcula valores para o retângulo
            objRet.calcularArea(base, altura);
            objRet.calcularPerimetro(base, altura);
            // instancia objeto da classe Triangulo
            Triangulo objTri = new Triangulo();
            // calcula valores para o triângulo
            objTri.calcularArea(base, altura);
            objTri.calcularPerimetro(base, altura);
            // inclui valores como atributos do "request" para poder 
            // encaminhá-los à página "exibeResultado.jsp"
            request.setAttribute("areaRet", objRet.getArea());
            request.setAttribute("perimetroRet", objRet.getPerimetro());
            request.setAttribute("areaTri", objTri.getArea());
            request.setAttribute("perimetroTri", objTri.getPerimetro());
            // declara objeto para redirecionar a execução do "request"
            RequestDispatcher rd = request.getRequestDispatcher("exibeResultado.jsp");
            // encaminha o processamento à página "exibeResultado.jsp"
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
