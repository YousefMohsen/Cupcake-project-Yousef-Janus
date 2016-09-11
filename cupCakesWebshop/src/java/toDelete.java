
import Controller.Controller;
import Data.DB;
import entity.BotTop;
import entity.CupCake;
import entity.Orders;
import entity.ProductsSold;
import entity.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yousinho
 */
public class toDelete {
    
 public static void main(String [] args) throws SQLException
	{
    Controller con = new Controller();
    
    
            System.out.println("Toppings: +\n");
            for (BotTop top : con.getBottoms()) {
                System.out.println(top.getName() + top.getPrice() + top.getID());
            }
        
//           
//        con.addToCart( new CupCake(con.getTopping("Orange"),con.getButtom("Chocolate"),2));
//        con.checkLogin("a", "a");
//        
//            System.out.println(con.totalPrice());
//            System.out.println("balance before: " + con.getCurrentuser().getBalance());
//  
//             con.addToCart( new CupCake(con.getTopping("Orange"),con.getButtom("Chocolate"),1));
//            
//            System.out.println(con.cartToString());
//            
//            System.out.println("balance after: " + con.getCurrentuser().getBalance());
//
//            for (Orders order : con.getOrders()) {
//                System.out.println( " User: "+order.getUser().getUsername()+" Price: "+order.getTotalPrice() );
//            }
//        
//             for (ProductsSold pr : con.getProductsSold()) {
//                 
//                System.out.println(" price: "+pr.getPrice()+ " orderNumb: "+pr.getOrderNumb()+" qty: "+pr.getQty()+"tpID"+pr.getToppingID());
//            }
      } 


} 