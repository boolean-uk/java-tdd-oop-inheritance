package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void canCheckInItem() {
        Library lib = new Library();
        lib.addToStock(new Book("1984"));
        Assertions.assertEquals("item has been checked out", lib.checkOutItem("1984"));
        Assertions.assertEquals("item is currently on loan", lib.checkOutItem("1984"));
        Assertions.assertEquals("item has been checked in", lib.checkInItem("1984"));
    }
}
