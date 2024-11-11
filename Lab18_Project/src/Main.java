import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void foo(Instrument instrument) {
        instrument.play();
        instrument.tune();
    }

    public static void main(String[] args) {
        // Create instances of Guitar and Drum and demonstrate:
        Instrument guitar = new Guitar(); // Guitar guitar = new Guitar();
        Instrument drum = new Drum(); // Drum drum = new Drum();
        
        // Testing...
        ArrayList<Instrument> instruments = new ArrayList<Instrument>(Arrays.asList(guitar, drum));

        // Example of "late binding."
        for (Instrument instrument: instruments) {
            instrument.play();
            instrument.tune();
        }

        System.out.println("\n\n\n");

        // (a) Tuning each instrument using the tune() method.
        guitar.tune();
        drum.tune();

        // (b) Playing each instrument's specific sound using the play method.
        guitar.play();
        drum.play();

        System.out.println("\n\n\n");

        // call foo
        foo(guitar);
        foo(drum);
    }
}
