/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String restaurantName;
    private int restaurantID;
    private static int count = 1;

    public Restaurant() {
        restaurantID = count;
        count++;
        this.restaurantName = restaurantName;
    }

   

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantID() {
        return restaurantID;
    }
    

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Restaurant.count = count;
    }

    
     @Override
    public String toString() {
        return restaurantName;
    }
}
