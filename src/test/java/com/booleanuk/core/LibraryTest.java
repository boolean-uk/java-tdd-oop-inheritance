package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    private Library library;
    private static Book EXAMPLE_BOOK = new Book("Title 1");
    private static Newspaper EXAMPLE_NEWSPAPER = new Newspaper("Title 2");
    private static Article EXAMPLE_ARTICLE = new Article("Title 3");



    @Test
    public void addToStock_ShouldAdd() {
        Library library = new Library();
        library.addToStock(EXAMPLE_ARTICLE);

        Assertions.assertEquals(EXAMPLE_ARTICLE.getTitle(), library.texts.get(0).getTitle());
    }

    @Test
    public void checkIn_ShouldBeNotOnLoan(){
        Library library = new Library();
        library.addToStock(EXAMPLE_ARTICLE);

        Assertions.assertEquals("item is not currently on loan", library.checkInText(EXAMPLE_ARTICLE.getTitle()));
    }

    @Test
    public void checkIn_ShouldBeOnLoan(){
        Library library = new Library();
        EXAMPLE_ARTICLE.setOnLoan();
        library.addToStock(EXAMPLE_ARTICLE);

        Assertions.assertEquals("item has been checked in", library.checkInText(EXAMPLE_ARTICLE.getTitle()));
    }

    @Test
    public void checkOut_ShouldBeCheckOut(){
        Library library = new Library();
        library.addToStock(EXAMPLE_BOOK);

        Assertions.assertEquals("item has been checked out", library.checkOutText(EXAMPLE_BOOK.getTitle()));
    }

    @Test
    public void checkOut_ShouldNotBeCheckOut(){
        Library library = new Library();
        library.addToStock(EXAMPLE_BOOK);
        EXAMPLE_BOOK.setOnLoan();

        Assertions.assertEquals("item is currently on loan", library.checkOutText(EXAMPLE_BOOK.getTitle()));
    }

    @Test
    public void checkOut_ShouldNotBeCheckOutNewspaper(){
        Library library = new Library();
        library.addToStock(EXAMPLE_NEWSPAPER);

        Assertions.assertEquals("newspapers are not available for loan", library.checkOutText(EXAMPLE_NEWSPAPER.getTitle()));
    }

    @Test
    public void checkOut_ShouldNotBeCheckInNewspaper(){
        Library library = new Library();
        library.addToStock(EXAMPLE_NEWSPAPER);

        Assertions.assertEquals("newspapers are not available for loan", library.checkInText(EXAMPLE_NEWSPAPER.getTitle()));
    }

    @Test
    public void checkIn_ShouldNotBeCheckInWrongTitle(){
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection", library.checkInText(EXAMPLE_NEWSPAPER.getTitle()));
    }

    @Test
    public void checkOut_ShouldNotBeCheckInWrongTitle(){
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection", library.checkOutText(EXAMPLE_NEWSPAPER.getTitle()));
    }
}
