package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Writing> writings = new ArrayList<>();

    public void addToStock(Writing writing) {
        this.writings.add(writing);
    }


    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkIn(String title) {
        List<Writing> filtered = this.writings.stream()
                .filter(writing -> writing.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOut(String title) {
        List<Writing> filtered = this.writings.stream()
                .filter(writing -> writing.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
