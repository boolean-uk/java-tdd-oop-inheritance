package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void createBook(){
        Assertions.assertDoesNotThrow(() -> new Book("tittle1", new Author("name", "2", "www.name1.pl")));
    }

    @Test
    public void getAuthor(){
        Author author = new Author("name", "2", "www.name1.pl");
        Article article = new Article("title1", author);

        Assertions.assertEquals(author, article.getAuthor());
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", new Author("name1", "1", "www"));
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", new Author("name1", "1", "www"));
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", new Author("name1", "1", "www"));
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", new Author("name1", "1", "www"));

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
