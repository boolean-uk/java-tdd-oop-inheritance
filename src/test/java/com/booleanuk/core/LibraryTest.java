package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void addToStockTest() {
        Library library = new Library();
        Author author = new Author("H","12","m@n");
        Book book = new Book("test",author);
        library.addToStock(book);
        Assertions.assertEquals(1,library.literatures.size());
    }

    @Test
    public void checkInArticleTest() {
        Library lib = new Library();
        Author author = new Author("H","12","m@n");
        Article article = new Article("Eyes",author);
        Article article2 = new Article("Hair",author);
        Article article3 = new Article("Mouth",author);

        lib.addToStock(article);
        lib.addToStock(article2);
        lib.addToStock(article3);

        Assertions.assertEquals("item is not currently on loan",lib.checkInLit("Hair"));
    }

    @Test
    public void checkInNonExistArticleTest() {
        Library lib = new Library();
        Author author = new Author("H","12","m@n");
        Article article = new Article("Eyes",author);
        Article article2 = new Article("Hair",author);
        Article article3 = new Article("Mouth",author);

        lib.addToStock(article);
        lib.addToStock(article2);
        lib.addToStock(article3);

        Assertions.assertEquals("item is not part of the library's collection",lib.checkInLit("Air"));
    }

    @Test
    public void checkInArticleOnLoanTest() {
        Library lib = new Library();
        Author author = new Author("H","12","m@n");
        Article article = new Article("Eyes",author);
        Article article2 = new Article("Hair",author);
        Article article3 = new Article("Mouth",author);

        lib.addToStock(article);
        lib.addToStock(article2);
        lib.checkOutLit("Hair");
        lib.addToStock(article3);

        Assertions.assertEquals("item has been checked in",lib.checkInLit("Hair"));
    }



}
