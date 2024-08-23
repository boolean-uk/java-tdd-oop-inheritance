package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    Library library;
    List<LibraryItem> libraryList;

    @Test
    public void addItemsToStock() {
        libraryList = new ArrayList<>();
        library = new Library(libraryList);

        library.addToStock(new Article("Hello World!"));
        library.addToStock(new Book("Object-Oriented Programming with Java"));
        library.addToStock(new Newspaper("Newspaper #1"));

        Assertions.assertEquals(3, libraryList.size());
        Assertions.assertEquals(Article.class, libraryList.get(0).getClass());

        // TODO: Not finished with tests
        // This test may not be how you should do it
    }
}
