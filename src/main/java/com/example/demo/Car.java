package com.example.demo;

import java.util.Random;

public class Car {

    private int id;
    private String name;
    private String manufacturer;
    private Boolean availability;

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Car(){

    }

    public int getId() {
        return id;
    }

    public void setId() {
        int min = 100;
        int max = 99999999;
        //TODO REPLACE random number alocation
        this.id = (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
