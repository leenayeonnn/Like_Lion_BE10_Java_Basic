package com.example.day06.example;

public class Ex2 {
    public static void main(String[] args) {
        // 다형성을 활용하여 Animal 타입의 배열 생성
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();
        animals[3] = new Animal(); // 기본 Animal 인스턴스도 포함

        // 각 동물의 makeSound() 메서드 호출
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
