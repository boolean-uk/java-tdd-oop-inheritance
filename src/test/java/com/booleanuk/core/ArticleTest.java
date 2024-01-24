package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    Author author1 = new Author("Pesoa", "Portugal", "pesoa.com");
    Author author2 = new Author("Deitel", "American", "deitel.com");
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks", author1);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", author2);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", author1);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", author1);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
