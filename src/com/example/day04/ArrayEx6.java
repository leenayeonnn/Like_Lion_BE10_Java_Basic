package com.example.day04;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //for each
        for (int i : arr) {
            System.out.println(i);
        }

        Item[] items = new Item[3];
        items[0] = new Item(500, "사과");
        items[1] = new Item(300, "바나나");
        items[2] = new Item(900, "수박");

        for (Item item : items) {
            System.out.print(item.getName());
            System.out.println(item.getPrice());
        }

        //////
        Item[] items2 = new Item[3];
        for (Item item : items2) {
            item = new Item(1, "k");
        }
        for (Item item : items2) {
            System.out.print(item.getName());
            System.out.println(item.getPrice());
        }

    }
}
