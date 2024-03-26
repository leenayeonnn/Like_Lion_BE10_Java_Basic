package com.example.day06.main;

import com.example.day06.domain.Bird;
import com.example.day06.domain.Parrot;
import com.example.day06.domain.Pigeon;
import com.example.day06.domain.Sparrow;

public class Test5 {
    public static void main(String[] args) {
        Bird bird = null;

        if (args[0].equals("앵무새")) {
            bird = new Parrot();
        } else if (args[0].equals("참새")) {
            bird = new Sparrow();
        } else {
            bird = new Pigeon();
        }

        bird.say();
    }
}
