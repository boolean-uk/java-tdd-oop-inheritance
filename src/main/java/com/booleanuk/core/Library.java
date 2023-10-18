package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Article> articles;
    private List<Book> books;
    private List<Newspaper> newspapers;

    public Library() {
        this.articles = new ArrayList<>();
        this.books = new ArrayList<>();
        this.newspapers = new ArrayList<>();
    }

    public void addToStock(Article item) {
        articles.add(item);
    }

    public void addToStock(Book item) {
        books.add(item);
    }

    public void addToStock(Newspaper item) {
        newspapers.add(item);
    }

    public void removeFromStock(Article item) {
        articles.remove(item);
    }

    public void removeFromStock(Book item) {
        books.remove(item);
    }

    public void removeFromStock(Newspaper item) {
        newspapers.remove(item);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Newspaper> getNewspapers() {
        return newspapers;
    }

    public String checkInArticle(String title) {
        for (Article article : articles) {
            if (article.getTitle().equals(title)) {
                return article.checkIn();
            }
        }
        return "Item is not part of the library's collection";
    }

    public String checkOutArticle(String title) {
        for (Article article : articles) {
            if (article.getTitle().equals(title)) {
                return article.checkOut();
            }
        }
        return "Item is not part of the library's collection";
    }

    public String checkInBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.checkIn();
            }
        }
        return "Item is not part of the library's collection";
    }

    public String checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.checkOut();
            }
        }
        return "Item is not part of the library's collection";
    }

    public String checkInNewspaper(String title) {
        for (Newspaper newspaper : newspapers) {
            if (newspaper.getTitle().equals(title)) {
                return newspaper.checkIn();
            }
        }
        return "Item is not part of the library's collection";
    }

    public String checkOutNewspaper(String title) {
        for (Newspaper newspaper : newspapers) {
            if (newspaper.getTitle().equals(title)) {
                return newspaper.checkOut();
            }
        }
        return "Item is not part of the library's collection";
    }
}