package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Document book = new Book("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Document book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Document book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Document book = new Book("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldPrintAuthor(){
        Book book = new Book("JUnit Rocks",
                new Author("Dave Ames",
                        "https:boolean.uk.com", "697745934", "daveamos@boolean.com"));
        String expectedPhone = "697745934";
        Assertions.assertEquals(expectedPhone, book.author.contactInfo.phoneNumber);

        System.out.println(book.author);

    }
}
