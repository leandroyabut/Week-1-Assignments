package com.leandroyabut.assignments.shapes;

public class Circle implements Shape{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle-");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}
