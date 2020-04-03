package com.expenses.analyser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping("/about")
    public String about(){
        return "The service is about storing the daily service and " +
                "getting the average expenditure based on day, month and year";
    }

}
