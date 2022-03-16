package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// faking db
@Service
public class db {

    public db(){
        // insert test data
        Car car1 = new Car();
        car1.setId();
        car1.setName("octavia");
        car1.setManufacturer("skoda");
        car1.setAvailability(true);
        carList.add(car1);

        Car car2 = new Car();
        car2.setId();
        car2.setName("favorit");
        car2.setManufacturer("skoda");
        car2.setAvailability(true);
        carList.add(car2);


        Car car3 = new Car();
        car3.setId();
        car3.setName("model x");
        car3.setManufacturer("tesla");
        car3.setAvailability(false);
        carList.add(car3);

        RentalRecord rentalRecord = new RentalRecord();
        rentalRecord.setId();
        rentalRecord.setCarId(car1.getId());
        rentalRecord.setDate(new Date());
        rentalRecordList.add(rentalRecord);

        RentalRecord rentalRecord2 = new RentalRecord();
        rentalRecord2.setId();
        rentalRecord2.setCarId(car2.getId());
        rentalRecord2.setDate(new Date());
        rentalRecordList.add(rentalRecord2);
    }

    public static List<Car> carList = new ArrayList<>();

    public static List<RentalRecord> rentalRecordList = new ArrayList<>();



}
