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
public class Orders {
    private int OrdNum;
    private User user;
    private int TotalPrice;
    private boolean pickedUp;

    public Orders(int OrdNum, User user, int TotalPrice, boolean pickedUp) {
        this.OrdNum = OrdNum;
        this.user = user;
        this.TotalPrice = TotalPrice;
        this.pickedUp = pickedUp;
    }
    
    
    
    

    public int getOrdNum() {
        return OrdNum;
    }

    public void setOrdNum(int OrdNum) {
        this.OrdNum = OrdNum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }
    
    
}
