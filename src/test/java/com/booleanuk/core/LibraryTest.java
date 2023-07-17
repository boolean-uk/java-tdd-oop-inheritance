package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Library library;
    @BeforeEach
    public void setup()
    {
        library= new Library();
    }
    @Test
    public void shouldCheckInArticleIfAvailable() {
        Article article = new Article("JUnit Rocks");
        library.addToStock(article);
        Assertions.assertEquals("item is not currently on loan", library.checkInItem(article.title));
    }
    @Test
    public void shouldCheckInBookIfAvailable() {
        Book book = new Book("JUnit Rocks");
        library.addToStock(book);
        Assertions.assertEquals("item is not currently on loan", library.checkInItem(book.title));
    }
    @Test
    public void shouldCheckInNewspaperIfAvailable() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");
        library.addToStock(newspaper);
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaper.title));

    }
    @Test
    public void shouldCheckOutArticleIfAvailable() {
        Article article = new Article("JUnit Rocks");
        library.addToStock(article);
        Assertions.assertEquals("item has been checked out", library.checkOutItem(article.title));
    }
    @Test
    public void shouldCheckOutBookIfAvailable() {
        Book book = new Book("JUnit Rocks");
        library.addToStock(book);
        Assertions.assertEquals("item has been checked out", library.checkOutItem(book.title));
    }
    @Test
    public void shouldCheckOutNewspaperIfAvailable_doesNotCheckOut() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");
        library.addToStock(newspaper);
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem(newspaper.title));

    }
}
