/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createCustomerAccount(String username, String password, Customer customer)
    {
      UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomer(customer);
        CustomerRole role = new CustomerRole();
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;  
    }
    
    public UserAccount createDeliverymanAccount(String username, String password, DeliveryMan deliveryMan)
    {
      UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setDeliveryMan(deliveryMan);
        DeliverManRole role = new DeliverManRole();
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;  
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public void removeUserAccount(String userName){
        
        UserAccount tempUserAccount = null;
        
        for(UserAccount userAccount : userAccountList){
            if(userAccount.getUsername().equalsIgnoreCase(userName))
            {
                tempUserAccount = userAccount;
                break;
            }
        }
        
        if(tempUserAccount != null)
            userAccountList.remove(tempUserAccount);
    }
}
