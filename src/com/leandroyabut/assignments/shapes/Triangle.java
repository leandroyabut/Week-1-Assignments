package com.leandroyabut.assignments.shapes;

public class Triangle implements Shape {

    private float base, height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return (base * height)/2;
    }

    @Override
    public void display() {
        System.out.println("Triangle-");
        System.out.println("Base: " + base + " Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
