package com.example.demo.rest;

import com.example.demo.Car;
import com.example.demo.warehouse.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseRestController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping(value = "/api/war")
    public List<Car> displayWarehouseItems() {
        return warehouseService.getAll();
    }

    @GetMapping(value = "/api/war/{id}")
    public Car displayWarehouseItem(@PathVariable("id") int id) {
        return warehouseService.getDesired(id);
    }

    @DeleteMapping(value = "/api/war/{id}")
    public Boolean deleteWarehouseItem(@PathVariable("id") int id) {
        return warehouseService.removeFromWarehouse(id);
    }

}
