package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class getgraph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Baby Graph</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write(" <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css\">\n");
      out.write(" <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write(" <script src=\"//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write(" <script src=\"//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js\"></script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <style>\n");
      out.write("    #id {\n");
      out.write("    background: url(images/cuty.jpg);\n");
      out.write("    background-size:1300px 800px;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-attachment:fixed; \n");
      out.write("} \n");
      out.write("    </style>\n");
      out.write("    <body id=\"id\" >\n");
      out.write("\n");
      out.write("       ");

         String name=request.getParameter("bname");
         
         String yr=request.getParameter("year");
         String gen=request.getParameter("sex");
         int maxyr=2013;
         int yrs=Integer.parseInt(yr);
            
         PreparedStatement ps=null;
         Connection con;
         ResultSet rs=null;
     
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
         out.println("<center><h2><i>Popularity of the "+name+" is</h2></center>");
         
      out.write("\n");
      out.write("         <div id=\"myfirstchart\" style=\"height: 250px;\"></div>\n");
      out.write("         <script>\n");
      out.write("        new Morris.Line({\n");
      out.write("  // ID of the element in which to draw the chart.\n");
      out.write("  element: 'myfirstchart',\n");
      out.write("  // Chart data records -- each entry in this array corresponds to a point on\n");
      out.write("  // the chart.\n");
      out.write("  data: [\n");
      out.write("  ");

            while(yrs<=maxyr)
         {
         ps=con.prepareStatement("select * from "+gen+""+yrs+" where Given_Name='"+name+"'");
         rs=ps.executeQuery();
         rs.next();
      out.write("\n");
      out.write("         \n");
      out.write("                  { year:'");
      out.print(yrs);
      out.write("', value:");
      out.print(rs.getString(3));
      out.write(" },\n");
      out.write("         ");

        
         yrs++;
         rs=null;
         }
 
        
      out.write("\n");
      out.write("  \n");
      out.write("   \n");
      out.write("    \n");
      out.write("  ],\n");
      out.write("  // The name of the data record attribute that contains x-values.\n");
      out.write("  xkey: 'year',\n");
      out.write("  // A list of names of data record attributes that contain y-values.\n");
      out.write("  ykeys: ['value'],\n");
      out.write("  // Labels for the ykeys -- will be displayed when you hover over the\n");
      out.write("  // chart.\n");
      out.write("  labels: ['Value']\n");
      out.write("});\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        ");
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
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
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
