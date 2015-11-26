<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get top babies</title>
    </head>
    
    <body bgcolor="white"><center>
        <%!
         ResultSet rs=null;
         PreparedStatement ps=null;
        Connection con=null;
        
        %>
        <%
           
            String ear=request.getParameter("ear");
            String tbabes=request.getParameter("tbabes");
            String gtype=request.getParameter("gtype");
        try{   
         
           Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
           if(!gtype.equals("bth"))
          ps=con.prepareStatement("select * from "+gtype+""+ear+" where rownum<= "+tbabes);
           else
           ps=con.prepareStatement("select Given_name,amount from(select given_name,amount from MA"+ear+" union select Given_name,amount from FE"+ear+" order by amount desc)where rownum<="+tbabes);    
          rs=ps.executeQuery();
           
          %>
          <h2>TOP BABIES LIST</h2>
          <b><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><></b><br>
          <%
          while(rs.next())
          {
              
            out.println("<b><i>"+rs.getString(1)+"</b></i><br>");
          }}
          catch(Exception e){
          
          }
       %>
        
        
        
    </center>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
       <%@include file="footer.html"%> 
    </body>
</html>

