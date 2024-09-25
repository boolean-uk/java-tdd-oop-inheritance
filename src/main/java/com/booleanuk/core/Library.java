package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    List <Item> items = new ArrayList<>();

    public void addToStock(Item item) {
        this.items.add(item);
    }

    public Library() {
    }

    public String checkIn(String title) {
        List<Item> filtered = this.items.stream()
                .filter(i -> i.title.equals(title)).collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOut(String title) {
        List<Item> filtered = this.items.stream()
                .filter(i -> i.title.equals(title))
                .collect(Collectors.toList());

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }


//    List<Article> articles;
//    List<Book> books;
//    List<Newspaper> newspapers;
//
//    public void addToStock(Article item) {
//        this.articles.add(item);
//    }
//
//    public void addToStock(Book item) {
//        this.books.add(item);
//    }
//
//    public void addToStock(Newspaper item) {
//        this.newspapers.add(item);
//    }
//
//    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
//    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
//    public String checkInArticle(String title) {
//        List<Article> filtered = this.articles.stream()
//                .filter(article -> article.title.equals(title)).collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkIn();
//    }
//
//    public String checkOutArticle(String title) {
//        List<Article> filtered = this.articles.stream()
//                .filter(article -> article.title.equals(title))
//                .collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkOut();
//    }
//
//    public String checkInBook(String title) {
//        List<Book> filtered = this.books.stream()
//                .filter(book -> book.title.equals(title))
//                .collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkIn();
//    }
//
//    public String checkOutBook(String title) {
//        List<Book> filtered = this.books.stream()
//                .filter(book -> book.title.equals(title))
//                .collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkOut();
//    }
//
//    public String checkInNewspaper(String title) {
//        List<Newspaper> filtered = this.newspapers.stream()
//                .filter(newspaper -> newspaper.title.equals(title))
//                .collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkIn();
//    }
//
//    public String checkOutNewspaper(String title) {
//        List<Newspaper> filtered = this.newspapers.stream()
//                .filter(newspaper -> newspaper.title.equals(title))
//                .collect(Collectors.toList());
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkOut();
//    }
}
