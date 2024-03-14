package com.example.day03.Practice;

import java.util.Scanner;

public class IfExam04 {
    /*
     * 복싱체급은 몸무게가 50.80kg 이하를 "플라이급",
     * 61.23kg 이하 "라이트급", 72.57kg 이하 "미들급",
     * 88.45kg 이하 "크루저급", 그 이상을 "헤비급"이라고 하자.
     * 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
    입력예 : 87.3

    출력예 : 크루저급
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게 입력 : ");
        double weight = sc.nextDouble();

        if(weight <= 50.8){
            System.out.println("플라이급");
        } else if (weight <= 61.23) {
            System.out.println("라이트급");
        } else if(weight <= 72.57){
            System.out.println("미들급");
        } else if(weight <= 88.45){
            System.out.println("크루저급");
        } else{
            System.out.println("헤비급");
        }
    }
}
