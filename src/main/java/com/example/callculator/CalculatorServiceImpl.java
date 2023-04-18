package com.example.callculator;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public String add(int num1, int num2){
        return (num1+ " + " +num2+ " = " +(num1+num2));
    }
    public String minus(int num1, int num2){
        return (num1+ " - " +num2+ " = " +(num1-num2));
    }
    public String divide(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");
            return "Делить на ноль нельзя";
        }

            return (num1+ " / " +num2+ " = " +(num1/num2));
    }
    public String multiply(int num1, int num2){
        return (num1+ " * " +num2+ " = " +(num1*num2));
    }

}
