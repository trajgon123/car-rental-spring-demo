package com.example.demo;

import java.util.Date;

public class RentalRecord {
    private int id;
    private int carId;
    private Date date;
    private String userSession;

    public RentalRecord() {

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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
