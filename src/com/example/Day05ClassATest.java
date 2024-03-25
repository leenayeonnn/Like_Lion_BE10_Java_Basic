package com.example;

import com.example.day05.ClassA;

public class Day05ClassATest extends ClassA{
    public static void main(String[] args) {
        ClassA classA = new ClassA();

        System.out.println(classA.pub);
//        System.out.println(classA.pro);
//        System.out.println(classA.def);
//        System.out.println(classA.pri);

        Day05ClassATest day05ClassATest = new Day05ClassATest();

        System.out.println(day05ClassATest.pub);
        System.out.println(day05ClassATest.pro);
//        System.out.println(day05ClassATest.def);
//        System.out.println(day05ClassATest.pri);
    }
}
