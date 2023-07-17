package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void shouldAddToStock() {
        Library library = new Library();
        library.addToStock(new Book("Book"));
        library.addToStock(new Article("Article"));
        library.addToStock(new Newspaper("Newspaper"));

        Assertions.assertEquals(3, library.items.size());
    }

    @Test
    public void testCheckingOutItem() {
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItems("Book"));

        library.addToStock(new Book("Book"));

        Assertions.assertEquals("item has been checked out", library.checkOutItems("Book"));
        Assertions.assertEquals("item is currently on loan", library.checkOutItems("Book"));
    }

    @Test
    public void testCheckingInItem() {
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Book"));

        library.addToStock(new Book("Book"));

        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Book"));

        library.checkOutItems("Book");
        Assertions.assertEquals("item has been checked in", library.checkInItem("Book"));
    }

}
