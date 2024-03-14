package com.example.day03;

public class ForEx {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("=============");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("=============");
//        for(;;){
//            System.out.println("무한루프");
//        }
    }
}
