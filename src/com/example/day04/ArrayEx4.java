package com.example.day04;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][1] = 10;

        int[][] arr2 = new int[3][];
        //arr2[0][0] = 10;
        //2차원으로 가르키는 것으 없기에 에러 발생

        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[10];


        ////
        int[][] arr3 = {{1, 2}, {3, 4}};
        int[][] arr4 = {{1, 2,}, {3, 4, 5}};
    }
}
