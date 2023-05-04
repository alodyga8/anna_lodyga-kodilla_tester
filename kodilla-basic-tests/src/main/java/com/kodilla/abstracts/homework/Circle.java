package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private final double PI = 3.1415927;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
