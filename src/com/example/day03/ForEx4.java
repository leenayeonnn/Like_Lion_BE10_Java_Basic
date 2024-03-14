package com.example.day03;

public class ForEx4 {
    public static void main(String[] args) {
        label1:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2) {
                    break label1;
                }
                System.out.println(i + ", " + k);
            }
        }

        label2:
        for(int i = 0; i< 3; i++){
            for(int k = 0; k < 3; k++){
                if( i == 0 && k == 2)
                    continue label2;
                System.out.println(i + ", " + k);
            }
        }
    }
}
