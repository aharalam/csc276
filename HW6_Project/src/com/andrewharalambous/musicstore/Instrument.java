package com.andrewharalambous.musicstore;

// Create a superclass called Instrument with:
// 1. A field name (string for the instrument's name.
// 2. A constructor to initialize the name.
// 3. A toString() method that returns the name of the instrument.
public class Instrument {
    // 1. A field name (string for the instrument's name.
    private String name;

    // 2. A constructor to initialize the name.
    public Instrument(String name) {
        this.name = name;
    }

    // 3. A toString() method that returns the name of the instrument.
    @Override
    public String toString() {
        return name;
    }
}
