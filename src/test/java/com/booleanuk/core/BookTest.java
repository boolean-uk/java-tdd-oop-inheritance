package com.booleanuk.core;

import com.booleanuk.core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void shouldCheckOutBookIfAvailable() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Book book = new Book("Java Programming",author);
        library.addToStock(book);

        Assertions.assertEquals("item has been checked out", library.checkOutItem("Java Programming"));
    }

    @Test
    public void shouldDeclineBookIfNotAvailableToCheckout() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Book book = new Book("Java Programming",author);
        library.addToStock(book);
        library.checkOutItem("Java Programming");

        Assertions.assertEquals("item is currently on loan", library.checkOutItem("Java Programming"));
    }

    @Test
    public void shouldCheckInBookIfOnLoan() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Book book = new Book("Java Programming",author);
        library.addToStock(book);
        library.checkOutItem("Java Programming");

        Assertions.assertEquals("item has been checked in", library.checkInItem("Java Programming"));
    }

    @Test
    public void shouldDeclineCheckInBookIfNotOnLoan() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Book book = new Book("Java Programming",author);
        library.addToStock(book);

        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Java Programming"));
    }
}
