package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks", null);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", null);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", null);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", null);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
    @Test
    public void authorGetterTest() {
        Author johnTolkien = new Author("John", "tolkien@gmail.com", "tolkien.com");
        Article article = new Article("Lord of The Rings", johnTolkien);
        Assertions.assertEquals(johnTolkien, article.getAuthor());
    }
}
