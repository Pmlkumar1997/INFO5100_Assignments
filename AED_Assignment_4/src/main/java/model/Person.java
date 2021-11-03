/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mohithparvataneni
 */

public class Person {
	
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String sex;
    private int age;
    private House house;
    private String maritalStatus;

    public Person(String firstName, String lastName, String phoneNumber, String sex, int age, House house, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
        this.house = house;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
            return firstName;
    }


    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }


    public String getLastName() {
            return lastName;
    }


    public void setLastName(String lastName) {
            this.lastName = lastName;
    }

    public String getPhoneNumber() {
            return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
    }


    public String getSex() {
            return sex;
    }


    public void setSex(String sex) {
            this.sex = sex;
    }


    public int getAge() {
            return age;
    }


    public void setAge(int age) {
            this.age = age;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
       	
}

