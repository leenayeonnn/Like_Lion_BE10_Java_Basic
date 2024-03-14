package com.example.day03.Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int input = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }

        System.out.println(input + "! = " + factorial);
    }
}
