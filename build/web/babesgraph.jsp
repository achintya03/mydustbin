<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>graphs</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
 <style>
    #ide {
    background: url(pics/cut.jpg);
    background-size:1390px 790px;
    background-repeat: no-repeat;
} 
</style>
    <body id="ide"><center>
    
         <font color="black"><h2>Graphical representation of their popularity</h2>
        <form action="getgraph.jsp">
           <b>Enter Name</b><input type="text" name="bname"><br><br>
            &nbsp;&nbsp;&nbsp;<b>Enter Year</b><input type="text" name="year"><br><br>
           
            <b>Gender</b><select name="sex">
                <option value="ma">Male</option>
                <option value="fe">Female</option>
            </select><br><br>
            <input type="submit" value="Go">
        </form>
          </font>
    </center>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <%@include file="footer.html"%>
    </body>
</html>
