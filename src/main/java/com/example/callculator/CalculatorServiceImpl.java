package com.example.callculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello(){
        return "Добро пожаловать в калькулятор";
    }
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int minus(int num1, int num2){
        return num1-num2;
    }
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");
            return 0;
        }

            return num1 / num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }

}
