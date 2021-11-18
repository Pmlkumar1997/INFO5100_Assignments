/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author mohithparvataneni
 */
public class Order extends WorkRequest{
    private String foodItemName;
    private double price;
    private int quantity;
    private String restaurantName;

    public Order(String foodItemName, double price, int quantity, String restaurantName) {
        this.foodItemName = foodItemName;
        this.price = price;
        this.quantity = quantity;
        this.restaurantName = restaurantName;
        this.setMessage("");
    }
    

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    
}
