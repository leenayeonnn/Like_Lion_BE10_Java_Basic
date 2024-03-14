package com.example.day04.practice;

import java.util.HashSet;
import java.util.Set;

public class Ex2No5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};


        int[] temp = new int[array1.length];
        int count = 0;

        roof:
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    continue roof;
                }
            }
            temp[count] = array1[i];
            count++;
        }

        int[] merge = new int[count + array2.length];
        System.arraycopy(temp, 0, merge, 0, count);
        System.arraycopy(array2, 0, merge, count, array2.length);

        for (int i : merge) {
            System.out.println(i);
        }

//        int[] array1 = {1, 3, 5, 7, 9};
//        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
//
//        Set<Integer> set = new HashSet<>();
//        for (int i : array1) {
//            set.add(i);
//        }
//
//        for (int i : array2) {
//            set.add(i);
//        }
//
//        for(int i : set){
//            System.out.println(i);
//        }
    }
}
