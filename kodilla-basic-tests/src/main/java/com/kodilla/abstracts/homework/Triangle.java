package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double base;
    private double side1;
    private double side2;
    private double height;

    public Triangle ( double base, double side1, double side2, double height) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + base;
    }
}
