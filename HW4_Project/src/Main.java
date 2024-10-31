// IMPORTANT:
// I made some modifications to the instructions of this assignment for efficiency:
// 1. The addItem method is now addItems and accepts an ArrayList of items, which are taken from the ArrayList put into the function call as a parameter and added to the Library object's items ArrayList.
// 2. The checkOutItem method is now checkOutItems and accepts infinitely many indices as arguments.
// 3. The returnItem method is now returnItems and accepts infinitely many indices as arguments.

// package
import com.andrewharalambous.library.*;

// imports
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a new Library instance
        Library library = new Library();

        // Create several books and journals:
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 320);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 341);
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 435);
        Book book4 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling", 734);
        Book book5 = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling", 870);
        Book book6 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 652);
        Book book7 = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling", 759);

        Journal journal1 = new Journal("Andrew's First Journal", "Andrew Haralambous", 1);
        Journal journal2 = new Journal("Andrew's Second Journal", "Andrew Haralambous", 2);
        Journal journal3 = new Journal("Andrew's Third Journal", "Andrew Haralambous", 3);
        Journal journal4 = new Journal("Andrew's Fourth Journal", "Andrew Haralambous", 4);
        Journal journal5 = new Journal("Andrew's Fifth Journal", "Andrew Haralambous", 5);
        Journal journal6 = new Journal("Andrew's Sixth Journal", "Andrew Haralambous", 6);
        Journal journal7 = new Journal("Andrew's Seventh Journal", "Andrew Haralambous", 7);

        // Add the objects to the Library
        ArrayList<LibraryItem> items = new ArrayList<LibraryItem>(Arrays.asList(
                book1, book2, book3, book4, book5, book6, book7,
                journal1, journal2, journal3, journal4, journal5, journal6, journal7
        ));

        library.addItems(items);

        // BEFORE CHECKOUT
        System.out.println("BEFORE CHECKOUT:");
        library.displayItems();

        // AFTER CHECKOUT
        System.out.println("\n\nAFTER CHECKOUT:");
        library.checkOutItems(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        library.displayItems();

        // AFTER RETURNING:
        System.out.println("\n\nAFTER RETURNING:");
        library.returnItems(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        library.displayItems();
    }
}
