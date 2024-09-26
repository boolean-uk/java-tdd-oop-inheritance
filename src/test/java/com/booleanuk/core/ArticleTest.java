package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleTest {
    private Article article;

    @BeforeEach
    public void setUp() {
        Author author = new Author("Petros", "123456", "www.some.com");
        article = new Article("Junit Rocks", author);
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void getAuthorsName() {
        Assertions.assertEquals("Petros", article.getAuthorName());
    }
}
