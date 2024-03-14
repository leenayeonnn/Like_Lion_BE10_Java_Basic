package com.example.day03;

public class ForEx2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=============");
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
//                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

        System.out.println("=============");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }

        System.out.println("=============");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }

    }
}
