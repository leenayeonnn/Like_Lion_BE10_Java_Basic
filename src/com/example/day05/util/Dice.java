package com.example.day05.util;

import java.util.Random;

public class Dice {
    private int face;
    private int eye;

    public Dice() {
        this(6);
    }

    public Dice(int face) {
        this.face = face;
    }

    public void roll() {
        eye = new Random().nextInt(face) + 1;
    }

    public int getEye() {
        return eye;
    }

}
