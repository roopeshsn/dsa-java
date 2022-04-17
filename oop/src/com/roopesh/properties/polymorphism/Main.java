package com.roopesh.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();

        circle.area();
        circle.greeting();
        triangle.area();
    }
}
