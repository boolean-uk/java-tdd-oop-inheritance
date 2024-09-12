package com.booleanuk.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testCheckInItem() {
        Library lib = new Library();
        Author author = new Author("John Smith", "97658732", "John@example.org", "JohnSmith.com");

        lib.addToStock(new Book("Shooter born in heaven", author));
        Assertions.assertEquals("item has been checked out", lib.checkOutItem("Shooter born in heaven"));
        Assertions.assertEquals("item is currently on loan", lib.checkOutItem("Shooter born in heaven"));
        Assertions.assertEquals("item has been checked in", lib.checkInItem("Shooter born in heaven"));
    }
}
