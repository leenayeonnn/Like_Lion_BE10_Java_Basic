package com.example.day04;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[][][] arr = new int[3][][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[3][];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new int[j + 1];
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = k;
                }
            }
        }

        for(int[][] arr2 : arr){
            for(int[] arr3 : arr2){
                for(int i : arr3){
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
