/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodItem;

import java.util.ArrayList;

/**
 *
 * @author mohithparvataneni
 */
public class Menu {
    
    private ArrayList<Item> itemsList;
    
    public Menu() {
        itemsList = new ArrayList<>();
    }

    public ArrayList<Item> getItemsList() {
        
        return itemsList;
    }

    public Item addItem(Item item) {
        
        itemsList.add(item);
        return item;
    }
}
