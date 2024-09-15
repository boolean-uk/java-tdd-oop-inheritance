package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    Author author = new Author("Bob", "bob@gmail.com", "911", "www.bob.com");
    Book book = new Book("JUnit Rocks", author);

    @Test
    public void shouldCheckOutIfAvailable() {
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldReturnAuthorInfo() {
        String expected = "This item is written by " + author.getName() + " (e-mail: " + author.getEmail() + ", phone number: "
                + author.getPhoneNumber() +", website: " + author.getWebsite() + ")";
        Assertions.assertEquals(expected, book.getAuthor());
    }
}
