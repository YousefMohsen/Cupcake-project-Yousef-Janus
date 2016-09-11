/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DB;
import entity.BotTop;
import entity.CupCake;
import entity.Orders;
import entity.ProductsSold;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Yousinho
 */
public class Controller {

    public Controller() {
       loadUsers();
       loadBottoms();
       loadToppings();

    }
    
    
    
    
    ArrayList<User> users = new ArrayList();
    ArrayList<BotTop> bottoms = new ArrayList();
    ArrayList<BotTop> toppings = new ArrayList();    
  ArrayList<CupCake> cart = new ArrayList();
      ArrayList<Orders> orders = new ArrayList();

  ArrayList<ProductsSold> productsSold = new ArrayList();
    User currentuser;

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<BotTop> getBottoms() {
        return bottoms;
    }

    public ArrayList<BotTop> getToppings() {
        return toppings;
    }

    public ArrayList<CupCake> getCart() {
        return cart;
    }

    public User getCurrentuser() {
        return currentuser;
    }
    
    public void setCurrentUser(User user) {
    
    currentuser = user;}
    
    
    public void register(String username, String password){
        int newID = users.size()+1;
    users.add(new User(newID,username,password));
    
    }
    
    public boolean checkLogin(String username, String password) {
   boolean result = false;   
        for (User user : users) {
            
            
            if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
            result = true;
            setCurrentUser(user);
            }
            
        }
    
    
    return result;}
    
public void addToCart(CupCake cupcake){
     cart.add(cupcake); }



    public BotTop getTopping(String topName){
 BotTop result = null;
        for (BotTop topping : toppings) {
          if(topping.getName().equals(topName)){result=topping;}  
        }
    
    return result;
    }
 public BotTop getButtom(String botName){
 BotTop result = null;
        for (BotTop bottom : bottoms) {
          if(bottom.getName().equals(botName)){result=bottom;}  
        }
    
    return result;
    }
 
 
 
 
 public int totalPrice(){
 int result = 0;
 
     for (CupCake cake : cart) {
         result+= cake.getPrice();
     }
 return result;
 }
 
 
 public void placeOrder(){
int newBalance = currentuser.getBalance()- totalPrice(); 
currentuser.setBalance(newBalance); //update balance


int ordernumb = orders.get(orders.size()-1).getOrdNum()+1;    
     System.out.println("ordernumb from controller: "+ordernumb);
orders.add(new Orders (ordernumb, currentuser,totalPrice(),false ) );
        


for (CupCake cake : cart) {
 ProductsSold newProduct = new  ProductsSold(ordernumb, cake.getCount(), cake.getPrice(), cake.getTopping().getID(), cake.getButtom().getID()); ;
    

 productsSold.add(newProduct);
}






cart.clear();

 }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public ArrayList<ProductsSold> getProductsSold() {
        return productsSold;
    }
    
    public String cartToString(){
   String result = "";
        for (CupCake cake : cart) {
       result += cake.getTopping().getName() + " "+cake.getButtom().getName()+" count: "+cake.getCount()+" Price: "+cake.getPrice()+"\n";
        }
    
  return result;  }
    
    
    
    public void clearCart(){
    
    cart.clear();
    
    }
 
 
    
//public void toDelete() {
//users.add(new User(1,"Messi","10",100));
//users.add(new User(2,"a","a",100));
//users.add(new User(3,"Xavi","6",100));
//
//bottoms.add(new BotTop("Chocolate",5,1) );
//bottoms.add(new BotTop("Almond",7,2) );
//bottoms.add(new BotTop("Vanilla",5,3) );
//
//toppings.add(new BotTop("Orange",8,1) );
//toppings.add(new BotTop("Lemon",8,2) );
//toppings.add(new BotTop("Blue cheese",9,3) );
//
//orders.add(new Orders (1, users.get(2),40,false ) );
//
////cart.add(new CupCake(getTopping("Orange"),getButtom("Chocolate"),3));
//
//}
public void loadUsers() {
        try {
            Connection conn = DB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM userinfo");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                users.add(new User(id, username, password));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void loadToppings() {
        try {
            Connection conn = DB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM toppings");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                toppings.add(new BotTop(name, price, id));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void loadBottoms() {
        try {
            Connection conn = DB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM bottoms");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                bottoms.add(new BotTop(name, price, id));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
