package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List<Document> documents;

    public Library() {
        documents = new ArrayList<>();
    }
    public void addToStock(Document document) {this.documents.add(document);}

    public String checkInDocument(String title) {
        List<Document> filtered = filterByTitle(title);
        return filtered.isEmpty() ? "item is not part of the library's collection" : filtered.get(0).checkIn();
    }

    public String checkOutDocument(String title) {
        List<Document> filtered = filterByTitle(title);
        return filtered.isEmpty() ? "item is not part of the library's collection" : filtered.get(0).checkOut();
    }

    private List<Document> filterByTitle(String title) {
        return this.documents.stream()
                .filter(document -> document.title.equals(title))
                .collect(Collectors.toList());
    }
}
