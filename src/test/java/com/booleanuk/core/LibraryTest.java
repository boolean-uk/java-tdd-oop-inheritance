package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    void addToStockTest_addArticleAsPosition(){
        Library library = new Library();
        Position position = new Article("article");
        library.addToStock(position);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "article");
    }

    @Test
    void addToStockTest_addArticleAsArticle(){
        Library library = new Library();
        Article article = new Article("article");
        library.addToStock(article);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "article");
    }

    @Test
    void addToStockTest_addBookAsPosition(){
        Library library = new Library();
        Position position = new Book("book");
        library.addToStock(position);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "book");
    }

    @Test
    void addToStockTest_addBookAsBook(){
        Library library = new Library();
        Book book = new Book("book");
        library.addToStock(book);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "book");
    }

    @Test
    void addToStockTest_addNewspaperAsPosition(){
        Library library = new Library();
        Position position = new Newspaper("Newspaper");
        library.addToStock(position);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "Newspaper");
    }

    @Test
    void addToStockTest_addNewspaperAsNewspaper(){
        Library library = new Library();
        Newspaper newspaper = new Newspaper("Newspaper");
        library.addToStock(newspaper);

        Assertions.assertEquals(library.itemsFromLibrary.size(), 1);
        Assertions.assertEquals(library.itemsFromLibrary.get(0).title, "Newspaper");
    }

    @Test
    void checkInTest_withArticle_itemIsNotCurrentlyOnLoan(){
        Library library = new Library();
        Position position = new Article("article");
        library.addToStock(position);
        String message = library.checkIn(position.title);

        Assertions.assertEquals(message, "item is not currently on loan");
    }

    @Test
    void checkInTest_withArticle_itemHasBeenCheckedIn(){
        Library library = new Library();
        Position position = new Article("article");
        library.addToStock(position);
        library.checkOut("article");
        String message = library.checkIn(position.title);

        Assertions.assertEquals(message, "item has been checked in");
    }
    @Test
    void checkInTest_withArticle_itemIsNotInLibrary(){
        Library library = new Library();
        Position position = new Article("article");
        library.addToStock(position);
        String message = library.checkIn("book");

        Assertions.assertEquals(message, "item is not part of the library's collection");
    }

    @Test
    void checkInTest_withBook_itemIsNotCurrentlyOnLoan(){
        Library library = new Library();
        Position position = new Book("Book");
        library.addToStock(position);
        String message = library.checkIn(position.title);

        Assertions.assertEquals(message, "item is not currently on loan");
    }

    @Test
    void checkInTest_withBook_itemHasBeenCheckedIn(){
        Library library = new Library();
        Position position = new Book("Book");
        library.addToStock(position);
        library.checkOut("Book");
        String message = library.checkIn(position.title);

        Assertions.assertEquals(message, "item has been checked in");
    }
    @Test
    void checkInTest_withBook_itemIsNotInLibrary(){
        Library library = new Library();
        Position position = new Book("Book");
        library.addToStock(position);
        String message = library.checkIn("article");

        Assertions.assertEquals(message, "item is not part of the library's collection");
    }

    @Test
    void checkInTest_withNewspaper(){
        Library library = new Library();
        Position position = new Newspaper("Newspaper");
        library.addToStock(position);
        String message = library.checkIn(position.title);

        Assertions.assertEquals(message, "newspapers are not available for loan");
    }

    @Test
    void checkInTest_withNewspaper_itemIsNotInLibrary(){
        Library library = new Library();
        Position position = new Newspaper("Newspaper");
        library.addToStock(position);
        String message = library.checkIn("article");

        Assertions.assertEquals(message, "item is not part of the library's collection");
    }

    @Test
    void checkOutTest_withPosition_itemIsNotInLibrary(){
        Library library = new Library();
        Position position = new Position("Newspaper");
        library.addToStock(position);
        String message = library.checkOut("article");

        Assertions.assertEquals(message, "item is not part of the library's collection");
    }

    @Test
    void checkOutTest_withPosition(){
        Library library = new Library();
        Position position = new Position("Newspaper");
        library.addToStock(position);
        String message = library.checkOut("Newspaper");

        Assertions.assertEquals(message, "item has been checked out");
    }
}
