package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
//    List<Article> articles;
//    List<Book> books;
//    List<Newspaper> newspapers;

    List<ReadingItem> readingItems = new ArrayList<>();

    public void addToStock(ReadingItem item) {
        this.readingItems.add(item);
    }
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

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInReadingItem(String title) {
        List<ReadingItem> filtered = this.readingItems.stream()
                // lambders: .filter works like a loop
                .filter(readingItem -> readingItem.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutReadingItem(String title) {
        List<ReadingItem> filtered = this.readingItems.stream()
                .filter(readingItem -> readingItem.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }
//    public String checkInArticle(String title) {
//        List<Article> filtered = this.articles.stream()
//                // lambders: .filter works like a loop
//                .filter(article -> article.title.equals(title))
//                .toList();
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
//                .toList();
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
//                .toList();
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
//                .toList();
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
//                .toList();
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
//                .toList();
//
//        if (filtered.size() < 1) {
//            return "item is not part of the library's collection";
//        }
//
//        return filtered.get(0).checkOut();
//    }
}
