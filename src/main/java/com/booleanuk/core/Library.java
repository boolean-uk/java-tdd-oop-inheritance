package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Item> libraryItems;

    public Library(){
        this.libraryItems = new ArrayList<>();
    }

    public void addToStock(Item item){
        this.libraryItems.add(item);
    }
    public String checkInItem(String title) {
        List<Item> filtered = this.libraryItems.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutItem(String title) {
        List<Item> filtered = this.libraryItems.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
