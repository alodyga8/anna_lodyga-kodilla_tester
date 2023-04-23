package com.kodilla.inheritance.homework;

public class macOS extends OperatingSystem {
        public macOS(int year) {
            super(year);
        }

        public void macOSOn(){
            System.out.println("MacOS is turned on");
        }

        public void macOSOff() {
            System.out.println("MacOS is turned off");
        }
    }

