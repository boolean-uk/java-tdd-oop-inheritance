package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Article article = new Article("JUnit Rocks", JUnitauthor);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Article article = new Article("JUnit Rocks", JUnitauthor);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Article article = new Article("JUnit Rocks", JUnitauthor);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Article article = new Article("JUnit Rocks", JUnitauthor);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
