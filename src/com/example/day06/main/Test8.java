package com.example.day06.main;

import com.example.day06.domain.Bus;
import com.example.day06.domain.Car;

public class Test8 {
    public static void main(String[] args) {
        Car car = new Car("BMW");

        System.out.println("-----");

        Bus bus = new Bus();

        System.out.println("-----");

        Bus bus2 = new Bus("city");
    }
}
