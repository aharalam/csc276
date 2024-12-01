package com.andrewharalambous.musicstore;

// Create a Guitar subclass of Instrument which implements Playable.
// The play() method should print: "Strumming the Guitar".
public class Guitar extends Instrument implements Playable {

    public Guitar(String name) {
        super(name); // super refers to the Instrument's constructor
    }

    @Override
    public void play() {
        System.out.println("Strumming the Guitar");
    }
}
