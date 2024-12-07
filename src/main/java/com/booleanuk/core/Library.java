package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Literature> literature;

    public Library() {
        this.literature = new ArrayList<>();
    }

    public void addToStock(Literature item) {
        this.literature.add(item);
    }

    public String checkInLiterature(String title) {
        List<Literature> filtered = this.literature.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "Item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutLiterature(String title) {
        List<Literature> filtered = this.literature.stream()
                .filter(literature -> literature.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public List<Literature> getLiterature() {
        return this.literature;
    }
}
