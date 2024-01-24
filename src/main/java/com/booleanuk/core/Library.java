package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Stock> stockItems = new ArrayList<>();

    public void addToStock(Stock item) {
        this.stockItems.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInStock(String title) {
        List<Stock> filtered = this.stockItems.stream()
                .filter(stock -> stock.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutStock(String title) {
        List<Stock> filtered = this.stockItems.stream()
                .filter(stock -> stock.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
}
