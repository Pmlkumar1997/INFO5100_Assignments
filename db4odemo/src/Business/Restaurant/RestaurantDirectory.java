/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Restaurant addRestaurant(Restaurant restaurant){
        
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public Restaurant getRestaurant(String restaurantName){
        
        for(Restaurant restaurant :restaurantList){
            if(restaurant.getRestaurantName().equals(restaurantName)) return restaurant;
        }
        return null;
    }
    
     public boolean checkIfRestaurantisUnique(String restaurantName){
        
        for(Restaurant restaurant : restaurantList){
            
            if(restaurant.getRestaurantName().equals(restaurantName)) return false;
        }
        
        return true;
    }
    
}
