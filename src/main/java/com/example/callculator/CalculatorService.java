package com.example.callculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    String hello();
    String add(int num1, int num2);
    String minus(int num1, int num2);
    String divide(int num1, int num2);
    String multiply(int num1, int num2);


}
