public abstract class Instrument {
    String name;

    // A constructor to initialize the name variable.
    public Instrument(String name) {
        this.name = name;
    }

    // An abstract method play() which will be implemented by subclasses to define the
    // specific sound or operation of each instrument.
    public abstract void play();

    // A concrete method tune() that prints a message indicating the instrument
    // is being tuned.
    public void tune() {
        System.out.println(name + " is being tuned.");
    }
}
