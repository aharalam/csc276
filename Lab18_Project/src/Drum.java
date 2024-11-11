public class Drum extends Instrument {
    // A constructor to set the name
    public Drum() {
        super("Drum");
    }

    // Implementation of play() method for Drum class
    @Override
    public void play() {
        System.out.println("The drum is being hit in rhythm.");
    }
}
