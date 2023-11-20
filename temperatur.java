package com.example.tempratur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturController {

    private final Integer[] tempArray = {-3, -2, 2, 7, 12, 16, 18, 17, 12, 7, 3, -2};

    @GetMapping("/getTemperature")

    public Integer getTemperatur(@RequestParam String month) {
        int index = getMonthIndex(month);
        if (index >= 0 && index < tempArray.length) {
            return tempArray[index];
        } else {
            return null;
        }
    }

    private int getMonthIndex(String month) {
        switch (month.toLowerCase()) {
            case "januar":
                return 0;
            case "februar":
                return 1;
            case "mars":
                return 2;
            case "april":
                return 3;
            case "mai":
                return 4;
            case "juni":
                return 5;
            case "juli":
                return 6;
            case "august":
                return 7;
            case "september":
                return 8;
            case "oktober":
                return 9;
            case "november":
                return 10;
            case "desember":
                return 11;
            default:
                return -1;
        }
    }
}
