package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> libraryItems = new ArrayList<>();

    public void addToStock(LibraryItem item) {
      libraryItems.add(item);
    }

    public String checkInBook(String title) {
        List<LibraryItem> filtered = this.libraryItems.stream()
                .filter(l -> l.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutBook(String title) {
        List<LibraryItem> filtered = this.libraryItems.stream()
                .filter(l -> l.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }
}
