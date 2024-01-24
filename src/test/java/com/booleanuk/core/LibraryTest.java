package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void addStockTest() {
        Library library = new Library();
        Book book = new Book("book1");
        Article article = new Article("article1");
        library.addToStock(book);
        Assertions.assertEquals(1, library.seeList());
        library.addToStock(article);
        Assertions.assertEquals(2, library.seeList());
    }
    //@Test
    //public void
}
