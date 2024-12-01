package com.andrewharalambous.musicstore;

public class MusicStore {

    // A method to showcase an Instrument
    public void showcase(Instrument instrument) {
        // Print the name of the instrument
        System.out.println("Instrument: " + instrument); // instrument.toString()

        // Check if the instrument is playable using instanceof
        if (instrument instanceof Playable) {
            Playable playableInstrument = (Playable) instrument;
            playableInstrument.play();
        } else {
            System.out.println("This instrument is not playable.");
        }
    }
}
