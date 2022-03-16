package com.example.demo.warehouse;

import com.example.demo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;


    @GetMapping(value = "/warehouse")
    public String displayWarehouseData(Model model) {
        model.addAttribute("warehouseData", warehouseService.getAll());
        return "warehouse";
    }

    @GetMapping(value = "/warehouse-new")
    public String addWarehouseItem(Model model) {
        model.addAttribute("warehouseItem", new Car());
        return "addcar";
    }

    @PostMapping(value = "/warehouse-new")
    public String addWarehouseItemPost(@ModelAttribute("warehouseItem") Car car, Model model) {
        car.setId();
        warehouseService.addToWarehouse(car);
        return "redirect:/warehouse";
    }


    @GetMapping(value = "/warehouse-edit")
    public String editWarehouseItem(@RequestParam("id") int id, Model model) {
        model.addAttribute("warehouseItem", warehouseService.getDesired(id));
        return "editCar";
    }


    @PostMapping(value = "/warehouse-edit")
    public String editWarehouseItemPost(@ModelAttribute("warehouseItem") Car car) {
        warehouseService.editWarehouseItem(car);
        return "redirect:/warehouse";
    }

    @GetMapping(value = "/warehouse-remove")
    public String removeWarehouseItem(@RequestParam("id") int id, Model model) {
        model.addAttribute("warehouseItem", warehouseService.removeFromWarehouse(id));
        return "redirect:/warehouse";
    }


}
