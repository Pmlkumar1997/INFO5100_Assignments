/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan  {
    
   
    private int id;
    private String name;
    private static int count = 1;

    public DeliveryMan() {
        id = count;
        count++;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    

    
}
