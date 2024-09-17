package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);
        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
