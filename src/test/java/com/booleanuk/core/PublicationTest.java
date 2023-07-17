package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PublicationTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Publication article = new Article("JUnit Rocks");
        Publication book = new Book("JUnit Rocks 2");
        Publication newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("item has been checked out", article.checkOut());
        Assertions.assertEquals("item has been checked out", book.checkOut());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Publication article = new Article("JUnit Rocks");
        Publication book = new Book("JUnit Rocks 2");
        Publication newspaper = new Newspaper("The Daily Java");
        article.checkOut();
        book.checkOut();
        newspaper.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
        Assertions.assertEquals("item is currently on loan", book.checkOut());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Publication article = new Article("JUnit Rocks");
        Publication book = new Book("JUnit Rocks 2");
        Publication newspaper = new Newspaper("The Daily Java");
        article.checkOut();
        book.checkOut();
        newspaper.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
        Assertions.assertEquals("item has been checked in", book.checkIn());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Publication article = new Article("JUnit Rocks");
        Publication book = new Book("JUnit Rocks 2");
        Publication newspaper = new Newspaper("The Daily Java");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
        Assertions.assertEquals("item is not currently on loan", book.checkIn());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }
}
