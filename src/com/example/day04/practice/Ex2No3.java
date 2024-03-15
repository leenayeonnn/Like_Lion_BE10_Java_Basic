package com.example.day04.practice;

public class Ex2No3 {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 45, 100};

        int sum = 0;
        for (int i : scores) {
            sum += i;
        }

        System.out.printf("sum : %d, avg : %.2f",
                sum, (double) sum / scores.length);
    }
}
