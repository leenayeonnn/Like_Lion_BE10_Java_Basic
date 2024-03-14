package com.example.day03.Practice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("섭시 온도 입력 : ");
        double temp = sc.nextDouble();
        System.out.printf("섭씨 %.1f도 = 화씨 %.1f도\n", temp, temp * 9 / 5 + 32);
    }
}
