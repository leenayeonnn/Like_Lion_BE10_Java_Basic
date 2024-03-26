package com.example.day06.main;

import com.example.day06.domain.Pen;

public class Test7 {
    public static void main(String[] args) {
        Pen p = new Pen(10, "black");
        Pen p2 = new Pen(10, "black");

        // == 연산자는 객체에서 주소를 비교함
        if (p == p2) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

        // equals
        if (p.equals(p2)) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }

        System.out.println(p);
    }
}
