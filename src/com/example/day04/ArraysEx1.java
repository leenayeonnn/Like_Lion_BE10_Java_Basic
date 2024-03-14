package com.example.day04;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] from = {1, 2, 3, 4, 5, 6, 7,};
        int[] to = Arrays.copyOf(from, from.length);

        for (int i : to) {
            System.out.println(i);
        }

        System.out.println("===========");
        to = Arrays.copyOf(from, 10);

        for (int i : to) {
            System.out.println(i);
        }

        System.out.println("===========");
        to = Arrays.copyOfRange(from, 2, 4);

        for (int i : to) {
            System.out.println(i);
        }

        System.out.println("===========");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int compare = Arrays.compare(arr1, arr2);
        System.out.println(compare);

        System.out.println("===========");
        int[] arr3 = {1, 3, 2};

        Arrays.sort(arr3);
        for (int i : arr3) {
            System.out.println(i);
        }
    }
}
