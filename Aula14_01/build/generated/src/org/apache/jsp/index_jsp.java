package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import negocio.Calculo;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calculadora JSP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Calculadora JSP</h1>\n");
      out.write("        <form action='' method='get' n1='formN'>\n");
      out.write("           Insira o primeiro numero <input type=\"number\" name=\"number1\"><br/>\n");
      out.write("           Insira o segundo numero <input type=\"number\" name=\"number2\"><br/><br/>\n");
      out.write("           <input type='submit' name='btnSomar' value='Somar'>\n");
      out.write("            <input type='submit' name='btnSubtrair' value='Subtrair'>\n");
      out.write("            <input type='submit' name='btnMultiplicar' value='Multiplicar'>\n");
      out.write("            <input type='submit' name='btnDividir' value='Dividir'>\n");
      out.write("            </form>\n");
      out.write("        ");
 if(request.getParameter("number1") != null && request.getParameter("number2") != null){
            
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
                    
 } 
      out.write(" <br> ");

            out.println("Resultado: " + c.getC());
        }
            
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
