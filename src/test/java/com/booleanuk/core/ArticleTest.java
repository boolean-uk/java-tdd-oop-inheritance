package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Item article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Item article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Item article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Item article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldGetAuthor() {
        Author author = new Author("Name", "Email", "Website");
        Article article = new Article("JUnit Rocks", author);
        Article article2 = new Article("JUnit Rocks");
        Assertions.assertEquals(author, article.getAuthor());
        Assertions.assertNull(article2.getAuthor());
    }
}
