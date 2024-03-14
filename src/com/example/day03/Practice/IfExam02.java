package com.example.day03.Practice;

import java.util.Scanner;

public class IfExam02 {
    /*
     * “몸무게+100-키”를 비만수치 공식이라고 하자. 키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가
     * 0보다 크면 다음줄에 비만이라는 메시지를 출력하는 프로그램을 작성하시오. (출력형식은 아래 출력 예를 참고하세요.)
     *
     * 155 60
     *
     * 비만수치는 5입니다. 당신은 비만이군요.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("키 몸무게 : ");
        int height = sc.nextInt();
        int weight = sc.nextInt();

        int obesity = weight + 100 - height;
        if (obesity > 0) {
            System.out.println("비만수치는 " + obesity + "입니다. 당신은 비만이군요");
        } else {
            System.out.println("정상입니다");
        }
    }
}
