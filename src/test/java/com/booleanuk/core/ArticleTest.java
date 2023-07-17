package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Product article = new Article("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Product article = new Article("JUnit Rocks", new Author("Author 1", "contact 1", "website1") );
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Product article = new Article("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Product article = new Article("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
