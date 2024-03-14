package com.example.day03.Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        try {
            userInput();
        } catch (Exception e) {
            errorCheck(e);
        }
    }

    public static void userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int userInt = scan.nextInt();

        output(userInt);
    }

    public static void output(int userInt) {
        for(int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d \t", userInt, i, userInt * i);
        }
    }

    public static void errorCheck(Exception e) {
        System.out.println("양의 정수를 입력해주세요" + e.toString());
        userInput();
    }
}