package com.andrewharalambous.shapes;

public abstract class Shape {
    // An abstract method calculateArea().
    public abstract double calculateArea();

    // A concrete method getDescription() that returns a string, "This is a shape."
    public String getDescription() {
        return "This is a shape.";
    }
}
