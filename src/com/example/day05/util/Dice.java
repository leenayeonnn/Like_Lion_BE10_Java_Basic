package com.example.day05.util;

import java.util.Random;

public class Dice {
    private int face = 6;
    private int eye;

    public void roll() {
        eye = new Random().nextInt(face) + 1;
    }

    public int getEye() {
        return eye;
    }

}
