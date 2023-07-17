package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem item = new Article("JUnit Rocks");
        Assertions.assertEquals("Article has been checked out", item.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem item = new Article("JUnit Rocks");
        item.checkOut();

        Assertions.assertEquals("Article is currently on loan", item.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem item = new Article("JUnit Rocks");
        item.checkOut();

        Assertions.assertEquals("Article has been checked in", item.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem item = new Article("JUnit Rocks");

        Assertions.assertEquals("Article is not currently on loan", item.checkIn());
    }
}
