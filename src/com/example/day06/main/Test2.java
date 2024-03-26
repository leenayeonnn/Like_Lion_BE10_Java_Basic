package com.example.day06.main;

import com.example.day06.domain.Parent;

public class Test2 {
    public static void main(String[] args) {
        Parent parent = new Parent();

        // getName은 Class 클래스의 메서드
        System.out.println(parent.getClass().getName());
    }
}
