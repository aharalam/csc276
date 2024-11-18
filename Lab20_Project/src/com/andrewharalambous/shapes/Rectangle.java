package com.andrewharalambous.shapes;

import com.andrewharalambous.colors.Colorable;

// Rectangle class extends abstract class Shape and implements Colorable interface.
public class Rectangle extends Shape implements Colorable {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color; // Are we setting the Rectangle's color
    }

    // Implements the calculateArea() method to compute the area of a rectangle.
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implements the setColor method from the Colorable interface.
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    // Implements the getColor method from the Colorable interface.
    @Override
    public String getColor() {
        return color;
    }
}
