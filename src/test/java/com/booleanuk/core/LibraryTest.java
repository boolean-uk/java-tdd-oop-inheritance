package com.booleanuk.core;

import com.booleanuk.core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void shouldCheckOutArticleIfAvailable() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Article article = new Article("JUnit Rocks",author);
        library.addToStock(article);

        Assertions.assertEquals("item has been checked out", library.checkOutItem("JUnit Rocks"));
    }

    @Test
    public void shouldDeclineArticleIfNotAvailableToCheckout() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Article article = new Article("JUnit Rocks",author);
        library.addToStock(article);
        library.checkOutItem("JUnit Rocks");

        Assertions.assertEquals("item is currently on loan", library.checkOutItem("JUnit Rocks"));
    }

    @Test
    public void shouldCheckInArticleIfOnLoan() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Article article = new Article("JUnit Rocks",author);
        library.addToStock(article);
        library.checkOutItem("JUnit Rocks");

        Assertions.assertEquals("item has been checked in", library.checkInItem("JUnit Rocks"));
    }

    @Test
    public void shouldDeclineCheckInArticleIfNotOnLoan() {
        Library library = new Library();
        Author author = new Author("Petros Mylonas", "Petros.Mylonas@email.com", "www.petrosmylonas.com");
        Article article = new Article("JUnit Rocks",author);
        library.addToStock(article);

        Assertions.assertEquals("item is not currently on loan", library.checkInItem("JUnit Rocks"));
    }

    // Similar modifications for Book and Newspaper tests
}
