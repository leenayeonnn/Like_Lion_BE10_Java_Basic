package com.example.day03.Practice;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input;
//
//        while (true) {
//            System.out.print("숫자 입력 : ");
//            try {
//                input = Integer.parseInt(sc.next());
//            } catch (NumberFormatException e) {
//                System.out.println("잘못된 입력");
//                continue;
//            }
//
//            if (input <= 0) {
//                System.out.println("양수만");
//            } else {
//                break;
//            }
//        }
//
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("%d x %d = %d \t", input, i, input * i);
//        }

        Scanner sc = new Scanner(System.in);
        String input;
        int num;

        while (true) {
            System.out.print("숫자 입력 : ");
            input = sc.next();

            if (!(input.matches("\\d*"))) {
                System.out.println("옳지 않은 입력. 다시입력");
                continue;
            }

            num = Integer.parseInt(input);
            if (num == 0) {
                System.out.println("양수만");
            } else {
                break;
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d \t", num, i, num * i);
        }
    }
}
