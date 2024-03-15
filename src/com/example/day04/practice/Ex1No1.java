package com.example.day04.practice;

public class Ex1No1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i : numbers) {
            System.out.println(i);
        }


    }
}
