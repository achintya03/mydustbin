package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class babesgraph_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.html");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>graphs</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write(" <style>\n");
      out.write("    #ide {\n");
      out.write("    background: url(pics/cut.jpg);\n");
      out.write("    background-size:1390px 790px;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("} \n");
      out.write("</style>\n");
      out.write("    <body id=\"ide\"><center>\n");
      out.write("    \n");
      out.write("         <font color=\"black\"><h2>Graphical representation of their popularity</h2>\n");
      out.write("        <form action=\"getgraph.jsp\">\n");
      out.write("           <b>Enter Name</b><input type=\"text\" name=\"bname\"><br><br>\n");
      out.write("            &nbsp;&nbsp;&nbsp;<b>Enter Year</b><input type=\"text\" name=\"year\"><br><br>\n");
      out.write("           \n");
      out.write("            <b>Gender</b><select name=\"sex\">\n");
      out.write("                <option value=\"ma\">Male</option>\n");
      out.write("                <option value=\"fe\">Female</option>\n");
      out.write("            </select><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Go\">\n");
      out.write("        </form>\n");
      out.write("          </font>\n");
      out.write("    </center>\n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>link to all pages</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("a:link {\r\n");
      out.write("    color: green;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("    color: pink;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("    color:cyan;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("    color:red;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("         \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("       \r\n");
      out.write("    <center><b><a href=\"gettoptenlist.jsp\">Get Top Baby</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"babesgraph.jsp\" >Baby Graph</a></b></center>       \r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
