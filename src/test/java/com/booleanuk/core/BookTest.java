package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author Osamah = new Author("Osamah Al-maliki", "osamah.al-maliki@no.experis.com", "osamah.com");
        Book book = new Book("JUnit Rocks", Osamah);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author Dave = new Author("David Ames", "david.ames@uk.boolean.com", "dave.com");
        Book book = new Book("JUnit Rocks", Dave);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author JK = new Author("JK Rowling", "jk@rowling.com", "jk.com");
        Book book = new Book("JUnit Rocks", JK);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author Arjela = new Author("Arjela Hamiti", "arjela.hamiti@gmail.com", "ah.com");
        Book book = new Book("JUnit Rocks", Arjela);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
