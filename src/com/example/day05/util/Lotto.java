package com.example.day05.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {

    private int range = 45;
    private int number = 6;
    private int[] balls;
    private int bonusBall;

    public Lotto() {
        balls = new int[number];
    }

    public void draw() {
        drawMainBalls();
        drawBonusBall();
    }

    private void drawMainBalls() {
        Random random = new Random();

        int temp;
        int count = 0;
        while (count < number) {
            temp = random.nextInt(range) + 1;

            if (isDuplicate(temp, count)) {
                continue;
            }

            balls[count++] = temp;
        }
    }

    private void drawBonusBall() {
        Random random = new Random();
        do {
            bonusBall = random.nextInt(range) + 1;
        } while (isDuplicate(bonusBall, number));
    }

    private boolean isDuplicate(int temp, int count) {
        for (int i = 0; i < count; i++) {
            if (temp == balls[i]) {
                return true;
            }
        }
        return false;
    }

//    public void draw() {
//
//        List<Integer> suffleList = suffleNumbers();
//
//        for (int i = 0; i < number; i++) {
//            balls[i] = suffleList.get(i);
//        }
//
//        bonusBall = suffleList.get(number);
//    }
//
//    private List<Integer> suffleNumbers() {
//        List<Integer> numberList = new ArrayList<>();
//        for (int i = 1; i <= range; i++) {
//            numberList.add(i);
//        }
//
//        Collections.shuffle(numberList);
//        return numberList;
//    }

    public int[] getBalls() {
        return balls;
    }

    public int getBonusBall() {
        return bonusBall;
    }
}
