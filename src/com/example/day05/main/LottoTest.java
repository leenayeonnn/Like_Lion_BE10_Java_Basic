package com.example.day05.main;

import com.example.day05.util.Lotto;

import java.util.Arrays;

public class LottoTest {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        lotto.draw();

        System.out.println("balls : " + Arrays.toString(lotto.getBalls()));
        System.out.println("bonus number : " + lotto.getBonusBall());
    }
}
