package com.example.day05;

public class VendingMachine {

    // 클래스 메서드
    public static void printVersion() {
        System.out.println("v.1");
    }

    // 인스턴스 메서드
    public String pushProductButton(int menuID) {

        switch (menuID) {
            case 1:
                return "콜라";
            case 2:
                return "사이다";
            case 3:
                return "환타";
            default:
                return null;
        }
    }

}
