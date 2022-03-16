package com.example.demo.warehouse;

import com.example.demo.Car;
import com.example.demo.db;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseService {

    public WarehouseService() {
    }


    public List<Car> getAll() {
        return db.carList;
    }

    public Car getDesired(int id) {
        if (db.carList.stream().anyMatch(car -> car.getId() == id)) {
            return db.carList.stream().filter(car -> car.getId() == id).collect(Collectors.toList()).get(0);
        }
        return null;
    }

    public void addToWarehouse(Car car) {
        db.carList.add(car);
    }

    public Boolean removeFromWarehouse(int id) {
        if (db.carList.stream().anyMatch(car -> car.getId() == id)) {
            db.carList.removeIf(car -> car.getId() == id);
            return true;
        } else {
            return false;
        }
    }

    public Boolean editWarehouseItem(Car carToEdit) {
        if (db.carList.stream().anyMatch(car -> car.getId() == carToEdit.getId())) {
            db.carList.stream().filter(car -> car.getId() == carToEdit.getId()).forEach(car -> {
                car.setName(carToEdit.getName());
                car.setManufacturer(carToEdit.getManufacturer());
                car.setAvailability(carToEdit.getAvailability());
            });
            return true;
        } else {
            return false;
        }
    }


}
