/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getcustomerList() {
        return customerList;
    }

    public Customer addCustomer(Customer customer) {
        
        customerList.add(customer);
        return customer;
    }
    
    public boolean checkIfcustomerisUnique(String userName){
        
        for(Customer customer : customerList){
            
            if(customer.getUserName().equals(userName)) return false;
        }
        
        return true;
    }
    
}
