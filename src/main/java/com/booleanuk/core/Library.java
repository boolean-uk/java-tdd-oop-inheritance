package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public List<LibraryItem> getItems() {
        return items;
    }

    public Library() {
        items = new ArrayList<>();
    }

    public void addToStock(LibraryItem item) {
        items.add(item);
    }

    public String checkInItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                return item.checkIn();
            }
        }
        return "item is not part of the library's collection";
    }

    public String checkOutItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                return item.checkOut();
            }
        }
        return "item is not part of the library's collection";
    }
}
