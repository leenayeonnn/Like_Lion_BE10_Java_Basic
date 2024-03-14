package com.example.day03.Practice;

import java.util.Scanner;

public class IfExam07 {
    /*
     * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을
     * 출력하는 프로그램을 작성하시오.


    입력예:18 -5 10
    출력예:-5
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3개 정수 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        System.out.println("최소값 : " + min);
    }
}
