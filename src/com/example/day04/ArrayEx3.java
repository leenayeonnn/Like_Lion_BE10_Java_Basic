package com.example.day04;

public class ArrayEx3 {
    public static void main(String[] args) {
        Item[] array1 = new Item[2];

        array1[0] = new Item(1000, "pen");
        array1[1] = new Item(4000, "note book");

        Item[] array2 = new Item[]{new Item(2000, "바나나"),
                new Item(4000, "사과")};

        Item[] array3 = {new Item(2000, "바나나"),
                new Item(4000, "사과")};

        System.out.println(array1[0].getName());
        System.out.println(array1[0].getPrice());
        System.out.println(array1[1].getName());
        System.out.println(array1[1].getPrice());

        for (int i = 0; i < 2; i++) {
            System.out.println(array2[i].getName());
            System.out.println(array2[i].getPrice());
        }
    }
}
