package com.andrewharalambous.library;

public class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        isAvailable = true; // set isAvailable to true initially
    }

    public void checkOut() {
        if (isAvailable) {isAvailable = false;}
    }

    public void returnItem() {
        if (!isAvailable) {isAvailable = true;}
    }

    public void displayDetails() {
        System.out.println("\n==== LibraryItem ====\nTitle: " + title + "\nAuthor: " + author + "\nIs Available: " + isAvailable);
    }

    public String toString() {
        return "\n==== LibraryItem ====\nTitle: " + title + "\nAuthor: " + author;
    }
}