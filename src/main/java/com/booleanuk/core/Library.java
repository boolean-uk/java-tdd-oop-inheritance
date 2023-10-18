package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Publication> publications = new ArrayList<>();

    public void addToStock(Publication item) {
        this.publications.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInPublication(String title) {
        List<Publication> filtered = this.publications.stream()
                .filter(publication -> publication.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutPublication(String title) {
        List<Publication> filtered = this.publications.stream()
                .filter(publication -> publication.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

}
