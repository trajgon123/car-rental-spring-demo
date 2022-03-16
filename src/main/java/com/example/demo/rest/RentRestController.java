package com.example.demo.rest;

import com.example.demo.Car;
import com.example.demo.rent.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RentRestController {

    @Autowired
    RentService rentService;

    @GetMapping(value = "/api/rent")
    public List<Car> getAllRentItems() {
        return rentService.getAll().stream().filter(Car::getAvailability).collect(Collectors.toList());
    }

    @GetMapping(value = "/api/rent/{id}")
    public Car getRentItem(@PathVariable("id") int id) {
        return rentService.getDesired(id);
    }


}
