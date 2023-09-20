package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Item book = new Book("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Item book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Item book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Item book = new Book("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
    @Test
    public void shouldGetAuthor() {
        Author author = new Author("Name", "Email", "Website");
        Book book1 = new Book("JUnit Rocks", author);
        Book book2 = new Book("JUnit Rocks");
        Assertions.assertEquals(author, book1.getAuthor());
        Assertions.assertNull(book2.getAuthor());
    }
}
