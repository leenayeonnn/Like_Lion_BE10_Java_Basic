package com.example.day04.practice;

public class Ex2No4 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};

        String temp;
        for (int i = 1; i < words.length; i++) {
            temp = words[0];
            words[0] = words[i];
            words[i] = temp;
        }

        for (String str : words) {
            System.out.println(str);
        }
    }
}
