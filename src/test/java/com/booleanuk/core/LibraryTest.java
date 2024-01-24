package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testCheckInArticle() {
        Article article = new Article("Here");
        Library check = new Library();
        check.addToStock(article);
        article.checkOut();


        String result = check.checkInItem("Here");

        Assertions.assertEquals("item has been checked in", result);

    }
    @Test
    public void testCheckOutArticle() {
        Article article = new Article("Here");
        Library check = new Library();
        check.addToStock(article);
        article.checkIn();


        String result = check.checkOutItem("Here");

        Assertions.assertEquals("item has been checked out", result);


    }
    @Test
    public void testCheckInBook() {
        Book book = new Book("Here");
        Library check = new Library();
        check.addToStock(book);
        book.checkOut();


        String result = check.checkInItem("Here");

        Assertions.assertEquals("item has been checked in", result);

    }
    @Test
    public void testCheckOutBook() {
        Book book = new Book("Here");
        Library check = new Library();
        check.addToStock(book);
        book.checkIn();


        String result = check.checkOutItem("Here");

        Assertions.assertEquals("item has been checked out", result);

    }
    @Test
    public void testCheckInNewspaper() {
        Newspaper newspaper = new Newspaper("Here");
        Library check = new Library();
        check.addToStock(newspaper);
        newspaper.checkOut();


        String result = check.checkInItem("Here");

        Assertions.assertEquals("newspapers are not available for loan", result);

    }
    @Test
    public void testCheckOutNewspaper() {
        Newspaper newspaper = new Newspaper("Here");
        Library check = new Library();
        check.addToStock(newspaper);
        newspaper.checkIn();


        String result = check.checkOutItem("Here");

        Assertions.assertEquals("newspapers are not available for loan", result);


    }

    @Test
    public void testCheckAuthorBook() {
        Author hassan = new Author("Hassan", "Elbrus", "343434");
        Book book = new Book("Here", hassan);
        Library check = new Library();
        check.addToStock(book);


        String result = book.getAuthorName();

        Assertions.assertEquals("Hassan", result);


    }


    @Test
    public void testCheckBookWithNoAuthor() {
        Author hassan = new Author("Hassan", "Elbrus", "343434");
        Book book = new Book("Here");
        Library check = new Library();
        check.addToStock(book);


        String result = book.getAuthorName();

        Assertions.assertEquals("We have nothing", result);


    }

    @Test
    public void testCheckArticleWithAuthor() {
        Author hassan = new Author("Hassan", "Elbrus", "343434");
        Article article = new Article("Here", hassan);
        Library check = new Library();
        check.addToStock(article);


        String result = article.getAuthorName();

        Assertions.assertEquals("Hassan", result);


    }
    @Test
    public void testCheckArticleWithNoAuthor() {
        Author hassan = new Author("Hassan", "Elbrus", "343434");
        Article article = new Article("Here");
        Library check = new Library();
        check.addToStock(article);


        String result = article.getAuthorName();

        Assertions.assertEquals("We have nothing", result);


    }



}
