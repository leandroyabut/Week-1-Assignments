package com.leandroyabut.assignments.shapes;

public class Rectangle implements Shape{

    private float width, height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("Rectangle-");
        System.out.println("Width: " + width + " Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
