package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldHaveAuthorBob()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("Bob Bagel", book.getAuthor());
    }

    @Test
    public void shouldHaveContactInfo()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("+001938563924874570", book.getContactInfo());
    }

    @Test
    public void shouldHaveWebsite()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("https://www.bobbagel.eu", book.getWebsite());
    }
}
