package com.example.day04.practice;

public class Ex1No5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
