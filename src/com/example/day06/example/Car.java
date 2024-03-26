package com.example.day06.example;

public class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.printf("brand : %s , model : %s , year : %d\n",
                brand, model, year);
    }
}
