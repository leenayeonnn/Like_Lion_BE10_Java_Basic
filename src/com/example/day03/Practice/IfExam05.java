package com.example.day03.Practice;

import java.util.Scanner;

public class IfExam05 {
    /*
     * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A",
     * 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.


    입력예 : 4.3 3.5
    출력예 :B

    입력예 : 4.0 2.9
    출력예 :C

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade1, grade2;
        while (true) {
            System.out.print("학점 2개 입력 : ");
            grade1 = sc.nextDouble();
            grade2 = sc.nextDouble();

            if (grade1 >= 0 && grade1 <= 4.5 && grade2 >= 0 && grade2 <= 4.5)
                break;
            System.out.println("학점 범위가 잘못되었습니다. 다시 입력해 주세요");
        }

        if (grade1 >= 4 && grade2 >= 4) {
            System.out.println("A");
        } else if(grade1 >= 3 && grade2 >= 3){
            System.out.println("B");
        } else{
            System.out.println("C");
        }
    }
}
