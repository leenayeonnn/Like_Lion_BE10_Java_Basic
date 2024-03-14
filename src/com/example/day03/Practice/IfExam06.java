package com.example.day03.Practice;

import java.util.Scanner;

public class IfExam06 {
    /*
     * 영문 대문자를 입력받아 'A'이면 “매우잘함”,
     * 'B'이면 “잘함”, 'C'이면 “보통임”,
     * 'D'이면 “노력요함”, 'F'이면 “낙제”,
     * 그 외 문자이면 “잘못입력”이라고 출력하는 프로그램을 작성하시오.
    입력예:B

    출력예:잘함
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력(A,B,C,D,F) : ");
        String ch = sc.next();

        if(ch.equals("A")){
            System.out.println("매우잘함");
        } else if(ch.equals("B")){
            System.out.println("잘함");
        } else if(ch.equals("C")){
            System.out.println("보통");
        } else if(ch.equals("D")){
            System.out.println("노력요함");
        } else if(ch.equals("F")){
            System.out.println("낙제");
        } else{
            System.out.println("잘못입력");
        }
    }
}
