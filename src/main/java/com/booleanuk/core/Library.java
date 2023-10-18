package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Item> items = new ArrayList<>();
    public void addToStock(Item item) {this.items.add(item);}
    public String checkInItem(String title) {
        List<Item> filtered = this.items.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }
        return filtered.get(0).checkIn();
    }

    public String checkOutItem(String title) {
        List<Item> filtered = this.items.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
