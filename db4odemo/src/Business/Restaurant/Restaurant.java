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
    private String Location;
    private String managerName;
    private String userName;
    private String password;

    public Restaurant(String restaurantName, String Location, String managerName, String userName, String password) {
        this.restaurantName = restaurantName;
        this.Location = Location;
        this.managerName = managerName;
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    
     @Override
    public String toString() {
        return restaurantName;
    }
}
