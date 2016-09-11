<%-- 
    Document   : ShopPage
    Created on : 09-09-2016, 11:39:08
    Author     : Yousinho
--%>

<%@page import="entity.CupCake"%>
<%@page import="entity.BotTop"%>
<%@page import="java.util.List"%>
<%@page import="entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>      


        <script src="Script/ShopPageJS.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    
    <body>
        
                  <%   //get data from servlet  
        int totalPrice = (int) session.getAttribute("totalPrice");   
        int balance =(int) session.getAttribute("balance");
        String currentUser =(String) session.getAttribute("currentUser");
        String cartToString =(String) session.getAttribute("cartToString");



              
              %>
              
              
              

         
            
              


              <h1>Shop Page</h1>
              
   <div class="row">
       
       <div class="col-sm-3">  <p> Du er logget ind som:   <%= currentUser%>     </p> 
                            
       <p> Du har  <%=balance %>  $ på din konto  </p>
             

       
       </div>
  
            <div class="col-sm-5">
                    
     <img src="https://media.giphy.com/media/HZMBatubcJ1sY/giphy.gif" alt="HTML5 Icon"  >



                </div>
  <div class="col-sm-3">


  <h2>Cart</h2>

  <table class="table table-striped">
                        <thead>
                            <tr>
                                <th></th>
                            
                         
                            </tr>
                        </thead>
                        <tbody id="cartTable">
                           
                        </tbody>
                    </table>
        <label for="male"><%=cartToString %></label>
  <br>          <p> totalPrice  <%=totalPrice %>  </p>
     <br>

     <input type="submit" value="Place order" onclick="placeOrder(<%=balance%>,<%=totalPrice%>)" />
   
     <form action="NewServlet" method="POST">
             
    <input type="hidden" name="origin" value="clearCart">           

             
      <input type="submit" value="Clear Cart" />
         </form>
 

  </div>
                
     <div class="col-sm-2">


         
     </div>    
    </div>
        
                
          
                
                
                
                
<div class="row">
                          
    <form action="NewServlet" method="POST">

       <div class="col-sm-3">
                 <label for="sel1">Toppings</label>
              
              <select class="form-control" name="toppings"  >
                
                      
            <% 
                List<BotTop> toppings = (List<BotTop>)session.getAttribute("toppings");
                for(int i = 0; i < toppings.size(); i++){
                BotTop botTop = toppings.get(i);
            %> 
            <option>  <%= botTop.getName() %> </option>     
          
          <%
            } %>
                </select>
                             
      <input type="hidden" name="origin" value="toppingsForm">           

         <input type="submit" value="Add To cart" name="submitToping" onclick="AddToCart()" />
 
       
       </div>
       
       
       
       <div class="col-sm-3">
   
        
       <label for="sel1">Bottoms</label>
      <select class="form-control" name="bottoms"  >
            <% 
                List<BotTop> bottoms = (List<BotTop>)session.getAttribute("bottoms");
                for(int i = 0; i < bottoms.size(); i++){
                BotTop botTop = bottoms.get(i);
            %> 
            <option>  <%= botTop.getName() %> </option>     
          
          <%
            } %>
                </select>
       

       </div>
                
                
                   <div class="col-sm-1">   
                       <br>  

        <input type="text" name="count" value="1" />
    </div>   
                
             </form> 
                    
   <div class="col-sm-5">  
   
       <form action="NewServlet" method="POST" id="test">
           
  <input type="hidden" name="origin" value="placeOrder">           

          
          
      </form>
   
   
   
   </div>
                    
                </div>
                
                
    
    </body>
</html>

<%-- 


-----------------æææ


        
         <%   for(int i = 0; i < cart.size(); i++){
                CupCake cake = cart.get(i);
            %> 
            
         <tr>
        <td>  <%=  cake.getTopping().getName()        %> </td>
        <td><%=  cake.getButtom().getName()        %> </td>
        <td><%=  cake.getPrice()    %> </td>
      </tr>
          <%
            } %>

ææææææææææææææææææææææ
     <%  if(!cart.isEmpty()){ for(int i = 1; i < cart.size(); i++){
                CupCake cake = cart.get(i);
            %> 
            
         <tr>
        <td>  <%=  cart.size()        %> </td>
        <td><%=  cart.size()         %> </td>
        <td><%=  cart.size()      %> </td>
      </tr>
          <%
            } }%>
--------------------
--%>
