package com.example.day06.example;

public class ElectricCar extends Car {
    public int batteryCapacity;

    public ElectricCar(String brand, String name, int year, int batteryCapacity) {
        super(brand, name, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.printf("brand : %s , model : %s , year : %d , battery : %d\n",
                brand, model, year, batteryCapacity);
    }
}
