package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void addToLibrary(){
        Library library = new Library();

        Stock book = new Book("Lord Of The Rings", "Tolkien", "00000000","123.com");
        Stock article = new Article("Article1","Sander", "12345678", "VG.no");
        Stock newspaper = new Newspaper("VG");

        library.addToStock(book);
        library.addToStock(article);
        library.addToStock(newspaper);
        library.checkOut("Lord Of The Rings");

        String bookInStock=library.checkOut("Lord Of The Rings");
        String articleInStock=library.checkIn("Article1");
        String newspaperInStock=library.checkIn("VG");


        Assertions.assertEquals("item is not currently on loan",articleInStock);
        Assertions.assertEquals("item is currently on loan", bookInStock);
        Assertions.assertEquals("newspapers are not available for loan",newspaperInStock);

        bookInStock=library.checkIn("Lord Of The Rings");
        Assertions.assertEquals("item has been checked in",bookInStock);





    }
}
