package com.kodilla.abstracts.homework;

public class ShapeApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 8, 8,4 * Math.sqrt(3));
        System.out.println("Triangle perimeter equals: " + triangle.getPerimeter());
        System.out.println("Triangle area equals: " + triangle.getArea());

        Square square = new Square(4);
        System.out.println("Square perimeter equals: " + square.getPerimeter());
        System.out.println("Square area equals: " + square.getArea());

        Circle circle = new Circle(5);
        System.out.println("Circle perimeter equals: " + circle.getPerimeter());
        System.out.println( "Circle area equals: " + circle.getArea());
    }
}
