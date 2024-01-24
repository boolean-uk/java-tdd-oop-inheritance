package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddStock() {
        Library library = new Library();
        Author author = new Author("Pedro", "+0000000000","Website");

        WrittenObject writtenObject = new Article("Title1", author);

        library.addToStock(writtenObject);


        Assertions.assertEquals("item has been checked out", library.checkOutWrittenObject(writtenObject));

        Assertions.assertEquals("item is currently on loan", library.checkOutWrittenObject(writtenObject));

    }

    @Test
    public void testCheckInWrittenObject() {
        Library library = new Library();
        Author author = new Author("Pedro", "+0000000000","Website");

        WrittenObject writtenObject = new Article("Title1", author);
        library.addToStock(writtenObject);

        Assertions.assertEquals("item is not currently on loan", library.checkInWrittenObject(writtenObject));
        Assertions.assertEquals("item has been checked out", library.checkOutWrittenObject(writtenObject));
        Assertions.assertEquals("item has been checked in", library.checkInWrittenObject(writtenObject));

    }

    @Test
    public void testCheckOutWrittenObject() {
        Library library = new Library();
        Author author = new Author("Pedro", "+0000000000","Website");

        WrittenObject writtenObject = new Article("Title1", author);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutWrittenObject(writtenObject));

        library.addToStock(writtenObject);

        Assertions.assertEquals("item is not currently on loan", library.checkInWrittenObject(writtenObject));
        Assertions.assertEquals("item has been checked out", library.checkOutWrittenObject(writtenObject));
        Assertions.assertEquals("item is currently on loan", library.checkOutWrittenObject(writtenObject));
        Assertions.assertEquals("item has been checked in", library.checkInWrittenObject(writtenObject));

    }
}
