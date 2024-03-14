package com.example.day03;

public class SwitchEx {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("num is 1");
                break;
            case 2:
                System.out.println("num is 2");
                break;
            default:
                System.out.println("??");
        }

        //////////////////////////////////
        char ch = 'a';
        switch (ch) {
            case 'a':
            case 'A':
                System.out.println("A입니다.");
                break;
            case 'b':
            case 'B':
                System.out.println("B입니다.");
                break;
            case 'c':
            case 'C':
                System.out.println("C입니다.");
                break;
            default:
                System.out.println("A,B,C가 아닙니다.");
        }

        if (ch == 'a' || ch == 'A') {
            System.out.println("ch is A");
        } else if (ch == 'b' || ch == 'B') {
            System.out.println("ch is B");
        } else if (ch == 'c' || ch == 'C') {
            System.out.println("ch is C");
        } else {
            System.out.println("ch is not A, B, C");
        }
    }
}
