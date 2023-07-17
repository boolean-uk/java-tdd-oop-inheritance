package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void checkOutItemTest() {
        Library library = new Library();
        Assertions.assertEquals("item is not part of the library's collection",
                library.checkOutItem("Lord of The Rings"));
        library.addToStock(new Book("Lord of The Rings"));
        Assertions.assertEquals("item has been checked out",
                library.checkOutItem("Lord of The Rings"));
        library.addToStock(new Newspaper("Seals effect on environment"));
        Assertions.assertEquals("newspapers are not available for loan",
                library.checkOutItem("Seals effect on environment"));
    }
    @Test
    public void checkInItemTest() {
        Library library = new Library();
        Assertions.assertEquals("item is not part of the library's collection",
                library.checkInItem("Lord of The Rings"));
        library.addToStock(new Book("Lord of The Rings"));
        library.checkOutItem("Lord of The Rings");
        Assertions.assertEquals("item has been checked in",
                library.checkInItem("Lord of The Rings"));
        library.addToStock(new Newspaper("Seals effect on environment"));
        Assertions.assertEquals("newspapers are not available for loan",
                library.checkInItem("Seals effect on environment"));
    }
}
