/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodItem;

/**
 *
 * @author mohithparvataneni
 */
public class Item {
    
    private String itemName;
    private double price;
    private String availability;

    public Item(String itemName, double price, String availability) {
        this.itemName = itemName;
        this.price = price;
        this.availability = availability;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    
}
