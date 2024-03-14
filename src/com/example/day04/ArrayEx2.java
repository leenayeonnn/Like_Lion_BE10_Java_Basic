package com.example.day04;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        ///////////////////
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
