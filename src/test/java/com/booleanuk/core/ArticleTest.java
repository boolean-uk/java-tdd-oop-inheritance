package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleTest {

    private Article article;
    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("J.R.R. Tolkien", "tolkien@gmail.com",
                "555-555-5555", "tolkien.com");
        article = new Article("JUnit Rocks", author);
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
    public void testGetAuthor() {
        Assertions.assertEquals(author, article.getAuthor());
    }
}
