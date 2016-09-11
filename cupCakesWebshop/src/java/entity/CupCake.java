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
public class CupCake {
    
    
    private BotTop topping;
    private BotTop buttom;
    private int price;
    private int count;
    private int invoiceID;

    public CupCake(BotTop topping, BotTop buttom, int count) {
        this.topping = topping;
        this.buttom = buttom;
        this.count = count;
        this.price = (topping.getPrice()+buttom.getPrice())*count;
    }

    public BotTop getTopping() {
        return topping;
    }

    public void setTopping(BotTop topping) {
        this.topping = topping;
    }

    public BotTop getButtom() {
        return buttom;
    }

    public void setButtom(BotTop buttom) {
        this.buttom = buttom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }
    
    
}
