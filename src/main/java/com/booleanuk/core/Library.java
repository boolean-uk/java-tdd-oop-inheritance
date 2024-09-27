package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<ReadingMaterial> type = new ArrayList<>();

    public void addToStock(ReadingMaterial item) {
        this.type.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInMaterial(ReadingMaterial material) {
        List<ReadingMaterial> filtered = this.type.stream()
                .filter(type -> type.title.equals(material.title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutMaterial(ReadingMaterial material) {
        List<ReadingMaterial> filtered = this.type.stream()
                .filter(type -> type.title.equals(material.title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
