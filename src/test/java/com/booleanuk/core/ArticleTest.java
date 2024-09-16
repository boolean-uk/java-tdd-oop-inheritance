package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleTest {

    Author author;

    @BeforeEach
    void setUp() {
        author = new Author("Bob", "12345678", "bobsbagels.com");
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldReturnArticlesAuthor() {
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("Bob", article.getAuthor().getName());
    }
}
