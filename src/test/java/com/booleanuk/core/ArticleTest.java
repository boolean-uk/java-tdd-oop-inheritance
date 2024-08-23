package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Article article = new Article("JUnit Rocks", author);
        Assertions.assertEquals("Item has been checked out.", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("Item is currently on loan.", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("Item has been checked in.", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("Item is not currently on loan.", article.checkIn());
    }
}
