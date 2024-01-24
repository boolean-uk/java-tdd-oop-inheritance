package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void addingABookToStockTest() {
        Library library = new Library();
        Book book = new Book("The Handbook to Everything", new Author("Johnson", "12345678", "www.website@example.com"));
        library.addToStock(book);
        Assertions.assertEquals(book, library.items.get(0));
    }

    @Test
    public void checkInNotCheckedOutBookGivesErrorStringTest() {
        Library library = new Library();
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("title"));
    }

    @Test
    public void checkInCheckedOutBookTest() {
        Library library = new Library();
        Book book = new Book("The Handbook to Everything", new Author("Johnson", "12345678", "www.website@example.com"));
        book.checkOut();
        library.addToStock(book);
        Assertions.assertEquals("item has been checked in", library.checkInItem("The Handbook to Everything"));
    }

    @Test
    public void checkOutItemGivesTest() {
        Library library = new Library();
        Book book = new Book("The Handbook to Everything", new Author("Johnson", "12345678", "www.website@example.com"));
        library.addToStock(book);
        Assertions.assertEquals("item has been checked out", library.checkOutItem("The Handbook to Everything"));
    }
}
