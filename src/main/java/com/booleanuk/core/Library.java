package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Product> products = new ArrayList<>();

    public Library() {}


    public void addToStock(Product product) {
        this.products.add(product);
    }

    public String checkInProduct(String title) {
        List<Product> filtered = this.products.stream()
                .filter(product -> product.title.equals(title))
                .collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }


    public String checkOutProduct(String title) {
        List<Product> filtered = this.products.stream()
                .filter(product -> product.title.equals(title))
                .collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public int getProductCount() {
        return products.size();
    }

}