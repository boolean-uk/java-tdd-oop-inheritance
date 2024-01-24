package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void canCheckInItem() {
        Library lib = new Library();
        Author author = new Author("Per", "per@per.p", "perper.per");

        lib.addToStock(new Book("1984", author));
        Assertions.assertEquals("item has been checked out", lib.checkOutItem("1984"));
        Assertions.assertEquals("item is currently on loan", lib.checkOutItem("1984"));
        Assertions.assertEquals("item has been checked in", lib.checkInItem("1984"));
    }
}
