package com.example.day03;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 : ");
        int input = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }

        System.out.println("===========");

        System.out.print("input number : ");
        input = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);


    }
}
