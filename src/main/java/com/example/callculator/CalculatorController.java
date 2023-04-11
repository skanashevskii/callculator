package com.example.callculator;

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
    public String Hello(){
        return calculatorService.hello();
    }
    @GetMapping("/add")
    public int add(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.add(num1,num2);
    }
    @GetMapping("/minus")
    public int minus(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.minus(num1,num2);
    }
    @GetMapping("/divide")
    public int divide(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.divide(num1,num2);
    }
    @GetMapping("/multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.multiply(num1,num2);
    }
}
