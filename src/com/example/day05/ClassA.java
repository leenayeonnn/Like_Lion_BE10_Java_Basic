package com.example.day05;

public class ClassA {
    public static int fieldA;
    public int fieldB;

    private int pri;
    int def;
    protected int pro;
    public int pub;

    public static void main(String[] args) {
        ClassA classA = new ClassA();

        System.out.println(classA.pub);
        System.out.println(classA.pro);
        System.out.println(classA.def);
        System.out.println(classA.pri);
    }
}
