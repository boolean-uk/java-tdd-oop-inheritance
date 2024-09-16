package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {

        Library library = new Library();
        Newspaper news = new Newspaper("hei");
        library.addToItem(news);
        news.checkOut();

        Assertions.assertEquals("item has been checked in", library.checkInItem("hei"));
    }

}
