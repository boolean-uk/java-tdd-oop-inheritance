package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<WrittenObject> writtenObjects;

    public Library() {
        writtenObjects = new ArrayList<>();
    }
    public void addToStock(WrittenObject writtenObject) {
        this.writtenObjects.add(writtenObject);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInWrittenObject(WrittenObject object) {
        List<WrittenObject> filtered = this.writtenObjects.stream()
                .filter(writtenObject -> writtenObject.equals(object))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutWrittenObject(WrittenObject object) {
        List<WrittenObject> filtered = this.writtenObjects.stream()
                .filter(writtenObject -> writtenObject.equals(object))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

}
