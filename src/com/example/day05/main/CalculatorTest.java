package com.example.day05.main;

import com.example.day05.util.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(1,2));
        System.out.println(calculator.minus(1,2));
    }
}
