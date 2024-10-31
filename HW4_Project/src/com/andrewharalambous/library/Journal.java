// package
package com.andrewharalambous.library;


public class Journal extends LibraryItem {
    private int issueNumber;

    // Journal constructor
    public Journal(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    // Overriden displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("\n==== Journal ====\nTitle: " + title + "\nAuthor: " + author + "\nIs Available: " + isAvailable);
    }

    // Overriden toString method
    @Override
    public String toString() {
        return "\n==== Journal ====\nTitle: " + title + "\nAuthor: " + author + "Issue Number: " + issueNumber + "\n";
    }
}
