package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testAddItem() {
        Library library = new Library();
        Item book = new Book("Sovjietistan");
        library.addToStock(book);
        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Sovjietistan"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("NoTitle"));
    }
    @Test
    public void testCheckOut() {
        Library library = new Library();
        Item book = new Book("Sovjietistan");
        library.addToStock(book);
        Assertions.assertEquals("item has been checked out", library.checkOutItem("Sovjietistan"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("NoTitle"));
    }

}
