package com.example.day03.Practice;

import java.util.Scanner;

public class SWExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade;
        while(true){
            System.out.print("학점입력 : ");
            grade = sc.nextDouble();
            if(grade >= 0 && grade <= 4.5)
                break;
            System.out.println("학점 범위가 잘못되었습니다. 다시 입력해 주세요");
        }

        switch ((int)grade){
            case 4:
                System.out.println("장학금을 받아가세요.");
                break;
            case 3:
                System.out.println("다음 학기를 준비하세요.");
                break;
            case 2:
                System.out.println("계절 학기에 등록하세요.");
                break;
            default:
                System.out.println("다음 학기에 재수강하세요.");
        }
    }

}
