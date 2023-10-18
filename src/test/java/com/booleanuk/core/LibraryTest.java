package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void shouldAddDifferentTypesToList() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Book book = new Book("JUnit Rocks");
        Article article = new Article("JUnit Rocks");
        Library library = new Library();

        library.getSources().add(newspaper);
        library.getSources().add(article);
        library.getSources().add(book);

        Assertions.assertEquals(3, library.getSources().size());
    }

    @Test
    public void shouldFindInCheckedOutSourcesByName() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Book book = new Book("JUnit Rocks");
        Article article = new Article("JUnit Rocks");
        Library library = new Library();

        library.getSources().add(newspaper);
        library.getSources().add(article);
        library.getSources().add(book);


        String result = library.checkOutSources(book.title);

        Assertions.assertEquals("item has been checked out", result);
    }

    @Test
    public void shouldNotFindInCheckedOutSourcesByName() {
        Library library = new Library();
        String result = library.checkOutSources("JUnit Rocks");

        Assertions.assertEquals("item is not part of the library's collection", result);
    }


    @Test
    public void shouldInformNewspapersAreNotAvailableForLoan() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Library library = new Library();

        library.getSources().add(newspaper);

        String checkOutResult = library.checkOutSources(newspaper.title);
        String checkInResult = library.checkInSources(newspaper.title);

        Assertions.assertEquals("newspapers are not available for loan", checkOutResult);
        Assertions.assertEquals("newspapers are not available for loan", checkInResult);
    }

}
