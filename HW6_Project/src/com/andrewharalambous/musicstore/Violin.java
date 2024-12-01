package com.andrewharalambous.musicstore;

// The Violin instrument is non-playable, so we do not implement the play() method from Playable.
public class Violin extends Instrument { // implements Playable is not here because we do not want the Violin to be playable.
    public Violin(String name) {
        super(name); // super refers to the Instrument's constructor
    }
}
