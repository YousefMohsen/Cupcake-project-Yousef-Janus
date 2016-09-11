<%-- 
    Document   : Login
    Created on : 08-09-2016, 14:23:28
    Author     : Yousinho
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        

        <div class="row">
  <div class="col-sm-2">
  
  <img src="http://img11.deviantart.net/1407/i/2015/223/5/d/moonstone_blue_abstract_low_polygon_background_by_apatrimonio-d955466.jpg" class="img-rounded" alt="Cinque Terre" width="200" height="1000">
  
  
  </div>
  <div class="col-sm-4">
       <h1>Login</h1>
     <form action="NewServlet" method ="POST"> 

         <input type="text" name="username" value="a" /> <br>
            <input type="password" name="password" value="a" /> <br>
            <input type="submit" value="Submit" name="submit" /> <br>
             <input type="hidden" name="origin" value="login">

        </form>
                     <img src="https://d2gg9evh47fn9z.cloudfront.net/thumb_COLOURBOX6605352.jpg" alt="HTML5 Icon"  >
                     
  </div>
  <div class="col-sm-4">
       <h1>Register new user</h1>
         <form action="NewServlet" method ="POST"> 

            <input type="text" name="username" value="" /> <br>
            <input type="password" name="password" value="" /> <br>
            <input type="submit" value="Submit" name="submit" />            
            <input type="hidden" name="origin" value="register">           

        </form>
           <img src="http://www.clipartbest.com/cliparts/ncE/Xkz/ncEXkz74i.jpeg" >

  </div>

  
  
  <div class="col-sm-2">
    <img src="http://img11.deviantart.net/1407/i/2015/223/5/d/moonstone_blue_abstract_low_polygon_background_by_apatrimonio-d955466.jpg" class="img-rounded" alt="Cinque Terre" width="200" height="1000">

  </div>
            
            
            

</div>
       
  
         <div class="row">
  <div class="col-sm-2"> </div>
  <div class="col-sm-8">
  

  </div>

    <div class="col-sm-2"> </div>
  
  
         </div>
  
           


        
        
        
    </body>
</html>
