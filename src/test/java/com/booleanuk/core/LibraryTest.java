package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddToStock(){
        Library library = new Library();
        Inventory book = new Book("Moby dick");
        Inventory article = new Article("Medicine advancements");
        library.addToStock(book);
        library.addToStock(article);
        Assertions.assertEquals(2, library.inventories.size());
    }

    @Test
    public void testCheckInItem(){
        Library library = new Library();
        Inventory book = new Book("Moby dick");
        Inventory article = new Article("Medicine advancements");
        library.addToStock(book);
        library.addToStock(article);
        book.checkOut();
        article.checkOut();
        Assertions.assertEquals("item has been checked in", library.checkInItem("Moby dick"));
    }
    @Test
    public void testCheckInItemFail(){
        Library library = new Library();
        Inventory book = new Book("Moby dick");
        Inventory article = new Article("Medicine advancements");
        Assertions.assertEquals("item is not part of the library's collection",
                library.checkInItem("Moby dick"));
    }

    @Test
    public void testCheckOutItem(){
        Library library = new Library();
        Inventory book = new Book("Moby dick");
        Inventory article = new Article("Medicine advancements");
        library.addToStock(book);
        library.addToStock(article);
        Assertions.assertEquals("item has been checked out", library.checkOutItem("Moby dick"));
    }

    @Test
    public void testCheckOutItemFail(){
        Library library = new Library();
        Inventory book = new Book("Moby dick");
        Assertions.assertEquals("item is not part of the library's collection",
                library.checkOutItem("Moby dick"));

        library.addToStock(book);
        library.checkOutItem("Moby dick");
        Assertions.assertEquals("item is currently on loan",library.checkOutItem("Moby dick"));
    }
}
