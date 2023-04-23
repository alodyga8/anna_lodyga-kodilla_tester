package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {

    public WindowsXP(int year) {
        super(year);
    }

    public void windows11On(){
        System.out.println("Windows 11 is turned on");
    }

    public void windows11Off() {
        System.out.println("Windows 11 is turned off");
    }
}
