package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    List<LibraryItem> items;
    public Library(){
        this.items = new ArrayList<>();
    }

    public void addToStock(LibraryItem item) {
        this.items.add(item);
    }


    public String checkInItem(LibraryItem item){
        List<LibraryItem> filtered = this.items.stream()
                .filter(i -> i.equals(item.title))
                .collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }
    public String checkOutItem(LibraryItem item){
        List<LibraryItem> filtered = this.items.stream()
                .filter(i -> i.title.equals(item.title))
                .collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}