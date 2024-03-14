package com.example.day04;

public class ArgsEx1 {
    public static void main(String[] args) {
        int result1 = plus(1, 2, 3, 4, 5);
        int result2 = plus(new int[]{1, 2, 3, 4});

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int plus(int... vals) {
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }

        return sum;
    }
}
