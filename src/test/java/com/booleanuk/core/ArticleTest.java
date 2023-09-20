package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldGetAuthor() {
        Author author = new Author("SomeName", "SomeEmail", "SomeWebsite");
        Article article = new Article("JUnit Rocks", author);
        Assertions.assertEquals(author, article.getAuthor());
    }

    @Test
    public void shouldGetNullWhenAuthorUnspecified() {
        Article article = new Article("JUnit Rocks");
        Assertions.assertNull(article.getAuthor());
    }
}
