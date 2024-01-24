package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void testAddLiteratureToLibrary() {
        Library library = new Library();

        Article titanic = new Article("Titanic sinks after hitting iceberg");
        Book orwell = new Book("1984");
        Newspaper newYork = new Newspaper("The New York Times");

        library.addToStock(titanic);
        library.addToStock(orwell);
        library.addToStock(newYork);

        List<Literature> expected = new ArrayList<>();
        expected.add(titanic);
        expected.add(orwell);
        expected.add(newYork);

        Assertions.assertEquals(expected, library.getLiterature());
    }

    @Test
    public void checkInAndOutLiteratureToLibrary() {
        Library library = new Library();

        Article titanic = new Article("Titanic sinks after hitting iceberg");
        Book orwell = new Book("1984");
        Newspaper newYork = new Newspaper("The New York Times");

        library.addToStock(titanic);
        library.addToStock(orwell);
        library.addToStock(newYork);

        Assertions.assertEquals("item has been checked out", library.checkOutLiterature("1984"));
        Assertions.assertEquals("item is currently on loan", library.checkOutLiterature("1984"));
        Assertions.assertEquals("item has been checked in", library.checkInLiterature("1984"));
        Assertions.assertEquals("item is not currently on loan", library.checkInLiterature("1984"));

        Assertions.assertEquals("item has been checked out",
                library.checkOutLiterature("Titanic sinks after hitting iceberg"));
        Assertions.assertEquals("item is currently on loan",
                library.checkOutLiterature("Titanic sinks after hitting iceberg"));
        Assertions.assertEquals("item has been checked in",
                library.checkInLiterature("Titanic sinks after hitting iceberg"));
        Assertions.assertEquals("item is not currently on loan",
                library.checkInLiterature("Titanic sinks after hitting iceberg"));

        Assertions.assertEquals("newspapers are not available for loan",
                library.checkOutLiterature("The New York Times"));
        Assertions.assertEquals("newspapers are not available for loan",
                library.checkInLiterature("The New York Times"));
    }

    @Test
    public void testAddAuthorToBook() {
        Book nineteenEightyFour = new Book("1984");
        Author orwell = new Author("George Orwell", 120,
                "https://sv.wikipedia.org/wiki/George_Orwell", 1949);

        String expectedName = "George Orwell";
        int expectedAge = 120;
        String expectedWebsite = "https://sv.wikipedia.org/wiki/George_Orwell";
        int expectedReleaseYear = 1949;

        nineteenEightyFour.addAuthor(orwell);

        Assertions.assertEquals(expectedName, nineteenEightyFour.getAuthor().getName());
        Assertions.assertEquals(expectedAge, nineteenEightyFour.getAuthor().getAge());
        Assertions.assertEquals(expectedWebsite, nineteenEightyFour.getAuthor().getWebsite());
        Assertions.assertEquals(expectedReleaseYear, nineteenEightyFour.getAuthor().getReleaseYear());
    }
}
