package com.example.demo.rent;

import com.example.demo.Car;
import com.example.demo.db;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentService {

    public List<Car> getAll() {
        return db.carList;
    }

    public void rentNew(int id) {
        db.carList.stream().filter(car -> car.getId() == id).forEach(car -> car.setAvailability(false));
    }

    public Car getDesired(int id) {
        if (db.carList.stream().anyMatch(car -> car.getId() == id)) {
            return db.carList.stream().filter(car -> car.getId() == id).collect(Collectors.toList()).get(0);
        }
        return null;
    }

}
