package com.booleanuk.core;

import java.util.List;

public class Library {
    List<RentableReadingMaterial> rentableReadingMaterials;

    public void addToStock(RentableReadingMaterial rentableReadingMaterial) {
        this.rentableReadingMaterials.add(rentableReadingMaterial);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInRentableReadingMaterial(String title) {
        List<RentableReadingMaterial> filtered = this.rentableReadingMaterials.stream()
                .filter(rentableReadingMaterial -> rentableReadingMaterial.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.getFirst().checkIn();
    }

    public String checkOutRentableReadingMaterial(String title) {
        List<RentableReadingMaterial> filtered = this.rentableReadingMaterials.stream()
                .filter(rentableReadingMaterial -> rentableReadingMaterial.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.getFirst().checkOut();
    }
}
