/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

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
    
     public boolean checkIfmanagerisUnique(String userName){
        
        for(Restaurant restaurant : restaurantList){
            
            if(restaurant.getUserName().equals(userName)) return false;
        }
        
        return true;
    }
    
}
