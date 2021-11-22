/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.FoodItem.Menu;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String restaurantName;
    private String Location;
    private UserAccount userAccount;
    private Menu menu;
    private WorkQueue workQueue;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Restaurant(String restaurantName, String Location, UserAccount userAccount) {
        this.restaurantName = restaurantName;
        this.Location = Location;
        this.userAccount = userAccount;
        this.menu = new Menu();
        this.workQueue = new WorkQueue();
    }

    public Menu getMenu() {
        return menu;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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

   
     @Override
    public String toString() {
        return restaurantName;
    }
}
