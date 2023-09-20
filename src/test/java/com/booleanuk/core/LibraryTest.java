package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    void testCheckinAndOutItem(){
        Library library = new Library();
        Article article = new Article("Article");
        library.addToStock(article);
        Assertions.assertEquals("item is not currently on loan",library.checkInItem("Article"));
        Assertions.assertEquals("item has been checked out",library.checkOutArticle("Article"));
        Assertions.assertEquals("item is not part of the library's collection",library.checkInItem("Panagiotis"));
    }
}
