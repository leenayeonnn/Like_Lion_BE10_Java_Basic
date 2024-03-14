package com.example.day03;

public class WhileEx {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 3) {
            System.out.println(num);
            num++;
        }

        System.out.println("=============");

        num = 1;
        while (true) {
            if (num == 3) {
                break;
            }
            System.out.println(num);
            num++;
        }

        System.out.println("=============");

        num = 1;
        while (++num < 3) {
            System.out.println(num);
        }

        System.out.println("=============");

        num = 1;
        while (num++ < 3) {
            System.out.println(num);
        }

        System.out.println("=============");
        //1~100 짝수
        num = 1;
        int sum = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println("sum = " + sum);

        System.out.println("=============");
        num = 1;
        while (num++ < 10) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println(num);
        }

        System.out.println("=============");
        num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 3);

    }
}