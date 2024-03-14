package com.example.day04;

public class ArrayEx1 {
    public static void main(String[] args) {
        //선언
        int[] iarr;
        int iarr2[];

        // 생성
        iarr = new int[3];
        iarr2 = new int[5];

        // 이용
        iarr[0] = 10;
        iarr[1] = 20;

        int i = iarr[0];

        System.out.println(i);
        System.out.println(iarr[0]);

        ///////////////////////
        String[] strArr = new String[2];
        strArr[0] = "hi";
        strArr[1] = "hello";

        for (String str : strArr) {
            System.out.println(str);
        }

        ///////////////////
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(arr2[2]);
    }
}
