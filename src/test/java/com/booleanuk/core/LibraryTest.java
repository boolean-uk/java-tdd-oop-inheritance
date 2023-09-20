package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    private Library library;
    private Book book;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("Hello");
    }

    @Test
    public void testAddMethod() {
        Article article = new Article("Good Morning");
        library.addToStock(book);
        library.addToStock(article);

        Assertions.assertEquals(2, library.getProductCount());
    }

    @Test
    public void testCheckInProduct() {
        String expected = "item is not part of the library's collection";
        Assertions.assertEquals(expected, library.checkInProduct(book.title));
    }

    @Test
    public void testCheckInProduct2() {
        library.addToStock(book);
        book.checkIn();
        String expected = "item is not currently on loan";
        Assertions.assertEquals(expected, library.checkInProduct(book.title));
    }

    @Test
    public void testCheckInProduct3() {
        library.addToStock(book);
        book.checkOut();
        String expected = "item has been checked in";
        Assertions.assertEquals(expected, library.checkInProduct(book.title));
    }

    @Test
    public void testCheckOutProduct() {
        library.addToStock(book);
        String expected = "item has been checked out";
        Assertions.assertEquals(expected, library.checkOutProduct(book.title));
    }

    @Test
    public void testCheckOutProduct2() {
        library.addToStock(book);
        book.checkOut();
        String expected = "item is currently on loan";
        Assertions.assertEquals(expected, library.checkOutProduct(book.title));
    }


}
