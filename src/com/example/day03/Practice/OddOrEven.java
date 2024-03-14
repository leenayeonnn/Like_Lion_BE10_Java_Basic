package com.example.day03.Practice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다");
        } else {
            System.out.println(num + "은 홀수입니다");
        }
    }
}
