package com.booleanuk.core;

import java.util.List;

public class Library {
    List<LoanItem> loanItems;

    public void addToStock(LoanItem item) {
        this.loanItems.add(item);
    }

    public String checkIn(String title) {
        List<LoanItem> filtered = this.loanItems.stream()
                .filter(item -> item.title.equals(title))
                .toList();

        if (filtered.size() < 1)
            return "item is not part of the library's collection";

        return filtered.get(0).checkIn();
    }

    public String checkOut(String title) {
        List<LoanItem> filtered = this.loanItems.stream()
                .filter(book -> book.title.equals(title))
                .toList();

        if (filtered.size() < 1)
            return "item is not part of the library's collection";

        return filtered.get(0).checkOut();
    }
}
