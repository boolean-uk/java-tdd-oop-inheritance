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
}
