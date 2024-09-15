package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryTest {
    Author bookAuthor = new Author("Bram", "bram_with_fangs@gmail.com", "112", "www.bram_with_fangs.com");
    Author articleAuthor = new Author("Bob", "bob@gmail.com", "911", "www.bob.com");

    private Book book = new Book("Dracula", bookAuthor);
    private Newspaper newsPaper = new Newspaper("Dracula News");
    private Article article = new Article("A Study of Dracula", articleAuthor);

    @Test
    public void addToStockTest() {
        Library library = new Library();
        Assertions.assertTrue(library.stock.isEmpty());
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(book, newsPaper, article)), library.stock);
    }

    @Test
    public void checkInNewspaperTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newsPaper.title));
    }

    @Test
    public void checkOutNewspaperTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem(newsPaper.title));
    }

    @Test
    public void checkInNonExistentItemTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Twilight"));
    }

    @Test
    public void checkOutNonExistentItemTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Twilight"));
    }

    @Test
    public void checkInAndOutExistingItemTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("item has been checked out", library.checkOutItem(book.title));
        Assertions.assertEquals("item has been checked in", library.checkInItem(book.title));
    }

    @Test
    public void checkInExistingItemNotOnLoanTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("item is not currently on loan", library.checkInItem(article.title));
    }

    @Test
    public void checkOutExistingItemOnLoanTest() {
        Library library = new Library();
        library.addToStock(book);
        library.addToStock(newsPaper);
        library.addToStock(article);
        Assertions.assertEquals("item has been checked out", library.checkOutItem(book.title));
        Assertions.assertEquals("item is currently on loan", library.checkOutItem(book.title));
    }

}
