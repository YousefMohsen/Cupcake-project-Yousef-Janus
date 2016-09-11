/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Yousinho
 */
public class ProductsSold {
    
   private int PCNumb;
   private int orderNumb;
   private int qty;
   private int price;
   private int toppingID;
   private int bottomID;

    public ProductsSold( int orderNumb, int qty, int price, int toppingID, int bottomID) {

        this.orderNumb = orderNumb;
        this.qty = qty;
        this.price = price;
        this.toppingID = toppingID;
        this.bottomID = bottomID;
    }

   
   
   
    public int getPCNumb() {
        return PCNumb;
    }

    public void setPCNumb(int PCNumb) {
        this.PCNumb = PCNumb;
    }

    public int getOrderNumb() {
        return orderNumb;
    }

    public void setOrderNumb(int orderNumb) {
        this.orderNumb = orderNumb;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getToppingID() {
        return toppingID;
    }

    public void setToppingID(int toppingID) {
        this.toppingID = toppingID;
    }

    public int getBottomID() {
        return bottomID;
    }

    public void setBottomID(int bottomID) {
        this.bottomID = bottomID;
    }
    
    
}
