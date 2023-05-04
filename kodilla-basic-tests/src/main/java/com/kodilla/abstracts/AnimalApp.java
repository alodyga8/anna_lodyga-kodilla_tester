package com.kodilla.abstracts;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        dog.giveVoice();

        Duck duck = new Duck(2);
        duck.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
