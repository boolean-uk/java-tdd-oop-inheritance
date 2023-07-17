package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArticleTest {
    static Author author;
    @BeforeAll
    public static void setUpBeforeClass() {
         author = new Author("John", "787787877", "john.com");

    }
    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem item = new Article("JUnit Rocks", author);
        Assertions.assertEquals("Article has been checked out", item.checkOut());

    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem item = new Article("JUnit Rocks", author);
        item.checkOut();

        Assertions.assertEquals("Article is currently on loan", item.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem item = new Article("JUnit Rocks", author);
        item.checkOut();

        Assertions.assertEquals("Article has been checked in", item.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem item = new Article("JUnit Rocks", author);

        Assertions.assertEquals("Article is not currently on loan", item.checkIn());
    }
}
