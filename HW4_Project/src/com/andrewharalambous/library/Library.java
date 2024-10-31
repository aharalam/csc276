package com.andrewharalambous.library;


import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItems(ArrayList<LibraryItem> libraryItems) {
        items.addAll(libraryItems);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }

    public void checkOutItems(int... indices) {
        for (int index : indices) {
            if (index >= 0 && index < items.size()) {
                items.get(index).checkOut();
            } else {
                System.out.println("[ERROR]: Index " + index + " is out of bounds!");
            }
        }
    }

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
