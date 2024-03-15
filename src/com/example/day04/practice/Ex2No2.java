package com.example.day04.practice;

public class Ex2No2 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double d : doubles) {
            if (d > max)
                max = d;
            if (d < min)
                min = d;
        }

        System.out.println("최소 : " + min + ", 최대 : " + max);
    }
}
