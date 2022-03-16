package com.example.demo.records;

import com.example.demo.Car;
import com.example.demo.RentalRecord;
import com.example.demo.db;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordsService {

    public List<RentalRecord> getAllRecordsByCarId(int carId) {
        if (db.rentalRecordList.stream().anyMatch(record -> record.getCarId() == carId)) {
            return db.rentalRecordList.stream().filter(record -> record.getCarId() == carId).collect(Collectors.toList());
        }
        return null;
    }



}
