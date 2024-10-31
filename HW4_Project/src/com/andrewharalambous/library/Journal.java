package com.andrewharalambous.library;


public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n==== Journal ====\nTitle: " + title + "\nAuthor: " + author + "\nIs Available: " + isAvailable);
    }
    @Override
    public String toString() {
        return "\n==== Journal ====\nTitle: " + title + "\nAuthor: " + author + "Issue Number: " + issueNumber + "\n";
    }
}
