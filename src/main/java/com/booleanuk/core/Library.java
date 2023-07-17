package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> libraryItems;

    public Library() {
        libraryItems = new ArrayList<>();
    }

    public void addToStock(LibraryItem item) {
        this.libraryItems.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInLibraryItem(String title) {
        List<LibraryItem> filtered = this.libraryItems.stream()
                .filter(libraryItem -> libraryItem.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutLibraryItem(String title) {
        List<LibraryItem> filtered = this.libraryItems.stream()
                .filter(libraryItem -> libraryItem.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void clearLibrary() {
        libraryItems.clear();
    }

    public String getAuthorInformation(String title){
        List<LibraryItem> filtered = this.libraryItems.stream()
                .filter(libraryItem -> libraryItem.title.equals(title))
                .toList();
        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).authorInformation();
    }
}
