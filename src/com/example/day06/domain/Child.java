package com.example.day06.domain;

public class Child extends Parent {
    public int i = 10;

    // over loading
    public int getI(int i) {
        return i;
    }

    @Override
    public int getI() {
        return i;
    }
}
