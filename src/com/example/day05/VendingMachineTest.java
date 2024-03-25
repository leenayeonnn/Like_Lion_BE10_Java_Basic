package com.example.day05;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine.printVersion();

        VendingMachine vm = new VendingMachine();

        String menu = vm.pushProductButton(1);
    }
}
