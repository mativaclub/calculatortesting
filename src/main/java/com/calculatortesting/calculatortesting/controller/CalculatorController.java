package com.calculatortesting.calculatortesting.controller;

import com.calculatortesting.calculatortesting.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public Integer plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public int minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public int divide(@RequestParam Integer num1, @RequestParam Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "Can't proceed without a number";
//        }
        return calculatorService.divide(num1, num2);
    }

}

