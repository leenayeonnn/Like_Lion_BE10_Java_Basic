package com.example.day03.Practice;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("숫자 입력 : ");
            input = sc.nextInt();

            if (input > randomNum) {
                System.out.println("더 작은 수 입니다");
            } else if (input < randomNum) {
                System.out.println("더 큰 수 입니다.");
            } else {
                System.out.println("정답입니다.");
                break;
            }
        }
    }
}
