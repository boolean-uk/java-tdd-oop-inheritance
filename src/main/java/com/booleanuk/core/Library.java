package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {


    List<Position> itemsFromLibrary = new ArrayList<>();

    public void addToStock(Position item) {
        this.itemsFromLibrary.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)

    public String checkIn(String title) {
        List<Position> filtered = this.itemsFromLibrary.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }


    public String checkOut(String title) {
        List<Position> filtered = this.itemsFromLibrary.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public List<Position> getItemsFromLibrary() {
        return itemsFromLibrary;
    }

}
