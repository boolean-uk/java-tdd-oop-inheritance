package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    static Author author;
    @BeforeAll
    public static void setUpBeforeClass() {
        author = new Author("John", "787787877", "john.com");

    }
    @Test
    public void checkinTest(){
        Library library = new Library();
        library.addToStock(new Article("Article1",author));
        Assertions.assertEquals("Article is not currently on loan", library.checkInItem("Article1"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Article222"));
        library.addToStock(new Newspaper("Newspaper1"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem("Newspaper1"));
    }
    @Test
    public void checkoutTest(){
        Library library = new Library();
        library.addToStock(new Book("Book1",author));
        Assertions.assertEquals("Book has been checked out", library.checkOutItem("Book1"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Book222"));
        library.addToStock(new Newspaper("Newspaper1"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem("Newspaper1"));
    }

}
