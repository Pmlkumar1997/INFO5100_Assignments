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
public class Car {
    
    public String Manufacturer;
    public int seats;
    public String model;
    public int serialNumber;
    public int year;
    public String city;
    public String avail;
    public String maintenanceCertificate;

    public Car(String Manufacturer, int seats, String model, int serialNumber, int year, String city, String avail, String maintenanceCertificate) {
        this.Manufacturer = Manufacturer;
        this.seats = seats;
        this.model = model;
        this.serialNumber = serialNumber;
        this.year = year;
        this.city = city;
        this.avail = avail;
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(String maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }
    
}