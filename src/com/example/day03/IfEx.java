package com.example.day03;

public class IfEx {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        if (a > b) {
            System.out.println("a is larger than b");
        } else {
            System.out.println("b is larger than a");
        }

        // a가 짝수면 짝수라고 출력
        if (a % 2 == 0) {
            System.out.println("a is odd");
        } else {
            System.out.println("a is even");
        }

        ///////////////
        if (a == 0) {
            System.out.println("a is 0");
        } else if (a % 2 == 0) {
            System.out.println("a is odd");
        } else {
            System.out.println("a is even");
        }

        //중괄호 유무
        if (a > 10)
            System.out.println("a is larger than 10");
        System.out.println("is not in if");


        //삼항
        int result = (a > 5) ? 20 : 30;
        System.out.println(result);
    }
}
