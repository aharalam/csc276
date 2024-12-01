import com.andrewharalambous.musicstore.*;

public class Main {
    public static void main(String[] args) {
        // (a) Instantiate objects of Guitar, Piano, Drums, and an additional non-playable instrument (e.g., Violin).
        Guitar guitar = new Guitar("Guitar");
        Piano piano = new Piano("Piano");
        Drums drums = new Drums("Drums");
        Violin violin = new Violin("Violin");

        // (b) Pass each of these objects ot the showcase() method of MusicStore.
        MusicStore musicStore = new MusicStore();

        // Showcase guitar
        musicStore.showcase(guitar);
        System.out.println("\n");

        // Showcase piano
        musicStore.showcase(piano);
        System.out.println("\n");

        // Showcase drums
        musicStore.showcase(drums);
        System.out.println("\n");

        // Showcase violin
        musicStore.showcase(violin);
        System.out.println("\n");
    }
}
