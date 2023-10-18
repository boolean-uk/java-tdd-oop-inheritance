package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();

    @Test
    public void shouldAddItemToStock() {
        LibraryItem article = new Article("Article");
        LibraryItem book = new Article("Book");

        library.addToStock(article);
        library.addToStock(book);

        assertEquals(2, library.getItems().size());
    }

    @Test
    public void shouldNotCheckInItemIfIsNotInLibrary() {
        assertEquals("item is not part of the library's collection", library.checkInItem("Not in library"));
    }

    @Test
    public void shouldCheckInItemIfInLibrary() {
        LibraryItem article = new Article("Article");
        library.addToStock(article);

        assertEquals(article.checkIn(), library.checkInItem("Article"));
    }

    @Test
    public void shouldNotCheckOutItemIfIsNotInLibrary() {
        assertEquals("item is not part of the library's collection", library.checkOutItem("Not in library"));
    }

    @Test
    public void shouldCheckOutItemIfInLibrary() {
        LibraryItem article = new Article("Article");
        library.addToStock(article);

        assertEquals("item has been checked out", library.checkOutItem("Article"));
    }
}