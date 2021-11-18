/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan  {
    
   
    private String name;
    private int age;
    private String gender;
    private String email;
    private String contact;
    private String userName;
    private String password;
    private WorkQueue workQueue;

    public DeliveryMan(String name, int age, String gender, String email, String contact, String userName, String password) {
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.contact = contact;
        this.userName = userName;
        this.password = password;
        this.workQueue = new WorkQueue();
                
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
    
    
    public String toString() {
        return name;
    }
    
}
