package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.User;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("  <div class=\"col-sm-2\">\n");
      out.write("  \n");
      out.write("  <img src=\"http://img11.deviantart.net/1407/i/2015/223/5/d/moonstone_blue_abstract_low_polygon_background_by_apatrimonio-d955466.jpg\" class=\"img-rounded\" alt=\"Cinque Terre\" width=\"200\" height=\"1000\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("       <h1>Login</h1>\n");
      out.write("     <form action=\"NewServlet\" method =\"POST\"> \n");
      out.write("\n");
      out.write("         <input type=\"text\" name=\"username\" value=\"a\" /> <br>\n");
      out.write("            <input type=\"password\" name=\"password\" value=\"a\" /> <br>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"submit\" /> <br>\n");
      out.write("             <input type=\"hidden\" name=\"origin\" value=\"login\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("                     <img src=\"https://d2gg9evh47fn9z.cloudfront.net/thumb_COLOURBOX6605352.jpg\" alt=\"HTML5 Icon\"  >\n");
      out.write("                     \n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-4\">\n");
      out.write("       <h1>Register new user</h1>\n");
      out.write("         <form action=\"NewServlet\" method =\"POST\"> \n");
      out.write("\n");
      out.write("            <input type=\"text\" name=\"username\" value=\"\" /> <br>\n");
      out.write("            <input type=\"password\" name=\"password\" value=\"\" /> <br>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"submit\" />            \n");
      out.write("            <input type=\"hidden\" name=\"origin\" value=\"register\">           \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("           <img src=\"http://www.clipartbest.com/cliparts/ncE/Xkz/ncEXkz74i.jpeg\" >\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"col-sm-2\">\n");
      out.write("    <img src=\"http://img11.deviantart.net/1407/i/2015/223/5/d/moonstone_blue_abstract_low_polygon_background_by_apatrimonio-d955466.jpg\" class=\"img-rounded\" alt=\"Cinque Terre\" width=\"200\" height=\"1000\">\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("  \n");
      out.write("         <div class=\"row\">\n");
      out.write("  <div class=\"col-sm-2\"> </div>\n");
      out.write("  <div class=\"col-sm-8\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\"> </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("         </div>\n");
      out.write("  \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
