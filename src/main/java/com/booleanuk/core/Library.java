package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<LibraryItem> libraryitems = new ArrayList<>();


    public void addToStock(LibraryItem item) {
        this.libraryitems.add(item);
        System.out.println("why is not working?");
    }



    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInLibraryItems(String title) {
        List<LibraryItem> filtered = this.libraryitems.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutLibraryItems(String title) {
        List<LibraryItem> filtered = this.libraryitems.stream()
                .filter(newspaper -> newspaper.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
