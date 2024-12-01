package com.andrewharalambous.musicstore;

public class Piano extends Instrument implements Playable {
    public Piano(String name) {
        super(name); // super refers to the Instrument's constructor
    }

    // Implement the play() method from Playable because Drums objects are playable.
    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}
