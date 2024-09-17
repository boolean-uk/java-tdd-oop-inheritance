package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    void testItemsWithAuthors() {
        Library library = new Library();
        Article article = new Article("Article","author1","contact1","website1");
        library.addToStock(article);
        Assertions.assertEquals("item is not currently on loan",library.checkInItem("Article"));
        Book book = new Book("book","author2","contact2","website2");
        library.addToStock(book);
        Assertions.assertEquals("item is not currently on loan",library.checkInItem("book"));
    }
}
