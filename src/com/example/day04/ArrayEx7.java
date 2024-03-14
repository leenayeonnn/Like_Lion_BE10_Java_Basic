package com.example.day04;

public class ArrayEx7 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 3.7};

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double d : doubles) {
            if (d > max) max = d;
            if (d < min) min = d;
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
