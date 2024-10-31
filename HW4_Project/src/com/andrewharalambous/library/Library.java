// package
package com.andrewharalambous.library;


import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    // Library constructor to initialize a Library object with an empty ArrayList
    // (Program will not work without this.)
    public Library() {
        items = new ArrayList<>();
    }

    // (DIFFERENT FROM ASSIGNMENT'S INSTRUCTIONS): addItems method accepts an ArrayList of libraryItems to add multiple items at once.
    public void addItems(ArrayList<LibraryItem> libraryItems) {
        items.addAll(libraryItems);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }

    // (DIFFERENT FROM ASSIGNMENT'S INSTRUCTIONS): checkOutItems method accepts infinite indices as arguments
    public void checkOutItems(int... indices) {
        for (int index : indices) {
            if (index >= 0 && index < items.size()) {
                items.get(index).checkOut();
            } else {
                System.out.println("[ERROR]: Index " + index + " is out of bounds!");
            }
        }
    }

    // (DIFFERENT FROM ASSIGNMENT'S INSTRUCTIONS): returnItems method accepts infinite indices as arguments
    public void returnItems(int... indices) {
        for (int index : indices) {
            if (index >= 0 && index < items.size()) {
                items.get(index).returnItem();
            } else {
                System.out.println("[ERROR]: Index " + index + " is out of bounds!");
            }
        }
    }
}
