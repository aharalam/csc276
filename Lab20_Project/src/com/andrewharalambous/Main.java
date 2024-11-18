package com.andrewharalambous;

import com.andrewharalambous.shapes.Shape;
import com.andrewharalambous.shapes.Rectangle;
import com.andrewharalambous.colors.Colorable;

public class Main {

    // A printShapeDetails(Shape shape) method
    public static void printShapeDetails(Shape shape) {
        // Print the description, area, and color of the shape:
        System.out.println("Description: " + shape.getDescription());
        System.out.println("Area: " + shape.calculateArea());

        // Make sure that the shape is a Rectangle so that it has a color attribute.
        if (shape instanceof Rectangle) {
            Colorable colorable = (Colorable) shape;
            System.out.println("Color: " + colorable.getColor());
        }
    }


    public static void main(String[] args) {
        // Instantiate a Rectangle object
        Rectangle rectangle = new Rectangle(7, 3, "White");

        // Set the Rectangle's color using the setColor method.
        rectangle.setColor("Red");

        // Display the color, description, and area of the Rectangle.
        rectangle.getDescription();


        // Part 2 of assignment (Exploring Polymorphism):
        // Test the printShapeDetails method with different
        // instances of classes implementing Shape and Colorable.

        Shape shape = new Rectangle(16, 10, "Blue");
        Shape shape2 = new Rectangle(20, 7, "Green");

        printShapeDetails(shape);
        System.out.println();
        printShapeDetails(shape2);
    }
}
