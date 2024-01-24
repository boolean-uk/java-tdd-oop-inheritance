package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void shouldAddToStock() {
        Library library = new Library();
        Item item = new Item("JUnit Rocks");
        library.addToStock(item);

        Assertions.assertTrue(library.items.contains(item));
        Assertions.assertEquals(1, library.items.size());
    }

    @Test
    public void multipleItemsShouldAddToStock() {
        Library library = new Library();
        Item item = new Item("JUnit Rocks");
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(item);
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        Assertions.assertEquals(4, library.items.size());
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Library library = new Library();
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        Assertions.assertEquals("item has been checked out", article.checkOut());
        Assertions.assertEquals("item has been checked out", book.checkOut());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Library library = new Library();
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        library.addToStock(article);
        library.addToStock(book);
        article.checkOut();
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldDeclineCheckoutIfNotPartOfLibraryCollection() {
        Library library = new Library();
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        Item newspaper = new Newspaper("Java Newspaper");

        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java Rocks"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java for Beginners"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java Newspaper"));
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Library library = new Library();
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);
        article.checkOut();
        book.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
        Assertions.assertEquals("item has been checked in", book.checkIn());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Library library = new Library();
        Item article = new Article("Java Rocks");
        Item book = new Book("Java for Beginners");
        library.addToStock(article);
        library.addToStock(book);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
