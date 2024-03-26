package com.example.day06.example;

public class Ex1 {
    public static void main(String[] args) {
        // Car 클래스의 인스턴스 생성
        Car car = new Car("Hyundai", "Sonata", 2020);
        car.displayInfo();

        // ElectricCar 클래스의 인스턴스 생성
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 75);
        electricCar.displayInfo();
    }
}
