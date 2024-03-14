package com.example.day03.Practice;

import java.util.Scanner;

public class CalcSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int input;
//        int sum = 0;
//        do {
//            System.out.print("숫자 입력 : ");
//            input = sc.nextInt();
//            sum += input;
//        } while(input != 0);
//
//        System.out.println("sum = " + sum);

//        Scanner sc = new Scanner(System.in);
//
//        int input = -1;
//        int sum = 0;
//        do {
//            System.out.print("숫자 입력 : ");
//            try {
//                input = Integer.parseInt(sc.next());
//            } catch (NumberFormatException e) {
//                System.out.println("잘못된 입력");
//                continue;
//            }
//
//            if (input < 0) {
//                System.out.println("음수 불가");
//                continue;
//            }
//
//            sum += input;
//        } while (input != 0);
//
//        System.out.println("sum = " + sum);

        Scanner sc = new Scanner(System.in);

        String input = "";
        int num;
        int sum = 0;

        while (true) {
            System.out.print("숫자 입력 : ");
            input = sc.next();
            if (!(input.matches("\\d*"))) {
                System.out.println("옳지 않은 입력. 다시입력");
                continue;
            }

            num = Integer.parseInt(input);

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("sum = " + sum);
    }
}
