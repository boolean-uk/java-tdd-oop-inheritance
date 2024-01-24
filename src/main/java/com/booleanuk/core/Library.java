package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Literature> literature;
    public Library(){
        this.literature = new ArrayList<Literature>();

    }

    public void addToStock(Literature item) {
        this.literature.add(item);
    }



    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInLiterature(String title) {
        List<Literature> filtered = this.literature.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutLiterature(String title) {
        List<Literature> filtered = this.literature.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.isEmpty()) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }


}
