<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>search forum</title>
    </head>
     <style>
         
    #props {
    background: url(pics/kung.jpg);
    background-size:1390px 790px;
    background-repeat: no-repeat;
} 
</style>
    <body id="props">
   
        <h2 font-color="black"><b><i><font color="black">&nbsp;&nbsp;Survey Report</font></i></b></h2>
        <form action="gettoppest.jsp">
        <font color="pink"><b>&nbsp;&nbsp;&nbsp;<input type="text" name="ear" placeholder="Year" value="" />  
        
        <br><br>
        &nbsp;&nbsp;&nbsp;&nbsp;Male<input type="radio" name="gtype" value="MA"/>
        &nbsp;&nbsp;Female<input type="radio" name="gtype" value="FE" />&nbsp;&nbsp;&nbsp;Both<input type="radio" name="gtype" value="bth" /><br><br>
        
        &nbsp;&nbsp;&nbsp;Select Top<select name="tbabes">
             <option>10</option>
             <option>100</option>
             <option>200</option>
             <option>300</option>
             <option>400</option>
             <option>500</option>
             <option>600</option>
             <option>700</option>
             <option>800</option>
             <option>900</option>
             <option>1000</option>
             <option>1200</option>
             <option>1500</option>
            <option>2000</option>
        </select><br><br></b></font>
    &nbsp;&nbsp;&nbsp;<input type="submit" value="Find">
        </form>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <%@include file="footer.html"%>
      </body>
</html>

