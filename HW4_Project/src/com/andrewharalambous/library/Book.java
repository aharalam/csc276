// package
package com.andrewharalambous.library;


public class Book extends LibraryItem{
    private int pages;

    // Book constructor
    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "\n==== Book ====\nTitle: " + title + "\nAuthor: " + author + "Number of Pages: " + pages + "\n";
    }
}
