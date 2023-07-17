package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArticleTest {
    static Author AUTHOR;

    @BeforeAll
    static void testSetup() {
        AUTHOR = new Author("John", "123456789", "https://site.com");
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem article = new Article("JUnit Rocks", AUTHOR);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", AUTHOR);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", AUTHOR);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", AUTHOR);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
