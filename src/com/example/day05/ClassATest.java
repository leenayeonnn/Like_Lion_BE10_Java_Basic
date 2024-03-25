package com.example.day05;

public class ClassATest {
    public static void main(String[] args) {
        System.out.println(ClassA.fieldA);

        ClassA classA = new ClassA();
        System.out.println(classA.fieldB);

        System.out.println(classA.pub);
        System.out.println(classA.pro);
        System.out.println(classA.def);
        //System.out.println(classA.pri);
    }
}
