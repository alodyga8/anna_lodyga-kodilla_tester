package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.windows11On();
        windowsXP.windows11Off();

        macOS macOS = new macOS(2001);
        macOS.macOSOn();
        macOS.macOSOff();

        System.out.println(operatingSystem.getYear());
        System.out.println(windowsXP.getYear());
        System.out.println(macOS.getYear());
    }
}
