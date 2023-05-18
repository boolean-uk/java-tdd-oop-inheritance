package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    void checkInMediaShouldSucceed() {
        Library library = new Library();
        library.addToStock(new Book("JUnit Rocks"));
        Assertions.assertEquals("item is not currently on loan", library.checkInMedia("JUnit Rocks"));
    }
    @Test
    void checkInMediaShouldFail() {
        Assertions.assertEquals("item is not part of the library's collection", new Library().checkInMedia("I don't exist"));
    }
    @Test
    void checkOutMediaShouldSucceed() {
        Library library = new Library();
        library.addToStock(new Book("JUnit Rocks"));
        Assertions.assertEquals("item has been checked out", library.checkOutMedia("JUnit Rocks"));
    }
    @Test
    void checkOutMediaShouldFail() {
        Assertions.assertEquals("item is not part of the library's collection", new Library().checkOutMedia("I don't exist"));
    }
}
