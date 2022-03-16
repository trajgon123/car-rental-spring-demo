package com.example.demo.rent;

import com.example.demo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RentController {

    @Autowired
    RentService rentService;

    @GetMapping(value = "/rent")
    public String displayWarehouseData(Model model) {
        //pouze dostupna auta
        List<Car> availableCars = rentService.getAll().stream().filter(Car::getAvailability).collect(Collectors.toList());
        model.addAttribute("rentData", availableCars);
        return "rent";
    }


    @GetMapping(value = "/rent/new-rent")
    public String createNewRent(@RequestParam("id") int id) {
        rentService.rentNew(id);
        return "redirect:/rent";
    }


}
