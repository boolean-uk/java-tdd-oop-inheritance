package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Author author1 = new Author("Pesoa", "Portugal", "pesoa.com");
    Author author2 = new Author("Deitel", "American", "deitel.com");
    @Test
    public void addStockTest() {
        Library library = new Library();
        Book book = new Book("book1", author1);
        Article article = new Article("article1", author2);
        library.addToStock(book);
        Assertions.assertEquals(1, library.seeList());
        library.addToStock(article);
        Assertions.assertEquals(2, library.seeList());
    }
}
