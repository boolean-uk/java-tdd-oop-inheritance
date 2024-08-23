package com.booleanuk.core;

import java.util.List;

public class Library {
    List<LibraryEntry> items;

    public void addToStock(LibraryEntry le) {
        this.items.add(le);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInArticle(String title) {
        List<LibraryEntry> filtered = this.items.stream()
                .filter(article -> article.getTitle().equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutBook(String title) {
        List<LibraryEntry> filtered = this.items.stream()
                .filter(book -> book.getTitle().equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

}
