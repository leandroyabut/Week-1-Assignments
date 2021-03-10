package com.leandroyabut.assignments.shapes;

public class Shapes {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10.5f, 4.4f);
        Shape triangle = new Triangle(6.3f, 9.23f);
        Shape circle = new Circle(7.77f);

        rectangle.display();
        triangle.display();
        circle.display();

    }

}
