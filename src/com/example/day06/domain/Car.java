package com.example.day06.domain;

public class Car {
    String name;
    int speed;

    public Car() {
        this(null, 0);
        System.out.println("car : constructor no arg");
    }

    public Car(String name) {
        this(name, 0);
        System.out.println("car : constructor with name");
    }

    public Car(int speed) {
        this(null, speed);
        System.out.println("car : constructor with speed");
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        System.out.println("car : constructor with name and speed");
    }
}
