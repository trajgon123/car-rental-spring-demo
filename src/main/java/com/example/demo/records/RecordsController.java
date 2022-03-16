package com.example.demo.records;

import com.example.demo.rent.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecordsController {

    @Autowired
    RecordsService recordsService;

    @GetMapping(value = "/records")
    public String displayRentalRecords(@RequestParam("carId") int carId,Model model) {
        model.addAttribute("recordData", recordsService.getAllRecordsByCarId(carId));
        return "records";
    }


}
