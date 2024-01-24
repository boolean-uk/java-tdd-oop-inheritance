package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Inventory article = new Article("JUnit Rocks", new Author("Thomas Kvam",
                "myEmail@email.com", "Under construction"));
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Inventory article = new Article("JUnit Rocks", new Author("Thomas Kvam",
                "myEmail@email.com", "Under construction"));
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Inventory article = new Article("JUnit Rocks", new Author("Thomas Kvam",
                "myEmail@email.com", "Under construction"));
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Inventory article = new Article("JUnit Rocks", new Author("Thomas Kvam",
                "myEmail@email.com", "Under construction"));

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
