package com.booleanuk.core;

public class Article extends ReadingItem{
    private Author author;
    public Article(String title, Author author) {
        super (title);
        this.setAuthor(author);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
//    String title;
//
//    boolean onLoan = false;
//
//    public Article(String title) {
//        this.title = title;
//    }
//
//    public boolean isOnLoan() {
//        return onLoan;
//    }
//
//    public String checkIn() {
//        if (!this.isOnLoan()) {
//            return "item is not currently on loan";
//        }
//
//        this.onLoan = false;
//
//        return "item has been checked in";
//    }
//
//    public String checkOut() {
//        if (this.isOnLoan()) {
//            return "item is currently on loan";
//        }
//
//        this.onLoan = true;
//
//        return "item has been checked out";
//    }
}
