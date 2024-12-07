package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book(
                new Author(
                        "Carmen Barcia",
                        "none",
                        "booleanFinalExercise.com"
                ),
                "JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book(new Author(
                "Carmen Barcia",
                "none",
                "booleanFinalExercise.com"
        ),"JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book(new Author(
                "Carmen Barcia",
                "none",
                "booleanFinalExercise.com"
        ),"JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book(new Author(
                "Carmen Barcia",
                "none",
                "booleanFinalExercise.com"
        ),"JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void testAuthor() {
        Book book = new Book(new Author(
                "Carmen Barcia",
                "none",
                "booleanFinalExercise.com"
        ),"JUnit Rocks");


        Author a = book.author();
        Assertions.assertEquals("Carmen Barcia", a.getName());
        Assertions.assertEquals("none", a.getContactInfo());
        Assertions.assertEquals("booleanFinalExercise.com", a.getWebsite());
    }
}
