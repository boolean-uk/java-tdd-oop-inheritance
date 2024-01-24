package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Article> articles;
    List<Book> books;
    List<Newspaper> newspapers;
    List<Items> items;


    public Library() {
        this.articles = new ArrayList<>();
        this.books = new ArrayList<>();
        this.newspapers = new ArrayList<>();
        this.items = new ArrayList<>();

    }
    public void addToStock(Items item) {
        this.items.add(item);
    }

    public String checkInItem(String title) {
        List<Items> filtered = this.items.stream()
                .filter(items -> items.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutItem(String title) {
        List<Items> filtered = this.items.stream()
                .filter(items -> items.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public String getAuthor(String name) {

        for (Items item : items) {
            if (item.equals(name)) {
                return name;
            }
        }
        return "";
    }
}
