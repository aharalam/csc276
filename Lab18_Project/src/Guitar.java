public class Guitar extends Instrument {
    // A constructor to set the name
    public Guitar() {
        super("Guitar");
    }

    // Implementation of play() method for the Guitar class
    @Override
    public void play() {
        System.out.println("The guitar is strumming chords.");
    }
}
