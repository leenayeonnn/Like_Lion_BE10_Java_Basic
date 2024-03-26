package com.example.day06.main;

import com.example.day06.domain.Child;
import com.example.day06.domain.Parent;

public class Test4 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.getI());

        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.getI());

        Parent pc = new Child();
        System.out.println(pc.i);
        System.out.println(pc.getI());
    }
}
