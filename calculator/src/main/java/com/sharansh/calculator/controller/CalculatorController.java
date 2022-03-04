package com.sharansh.calculator.controller;

import com.sharansh.calculator.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private OperatorService operatorService;

    @GetMapping("/add")
    @ResponseBody
    public int add(@RequestParam int number1, @RequestParam int number2) {
        return operatorService.add(number1, number2);
    }
}
