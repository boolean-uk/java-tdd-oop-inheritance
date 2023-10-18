package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void shouldAddArticle(){
        //when
        Library library = new Library();
        library.addToStock(new Article("AAA"));
        Assertions.assertEquals(1,library.articles.size());
    }

    @Test
    public void shouldAddBook(){
        //when
        Library library = new Library();
        library.addToStock(new Book("BBB"));
        Assertions.assertEquals(1, library.books.size());
    }

    @Test
    public void shouldAddNewspaper(){
        //when
        Library library = new Library();
        library.addToStock(new Newspaper("CCC"));
        Assertions.assertEquals(1, library.newspapers.size());
    }
}
