package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    Author a = new Author("", "", "");
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks", a);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", a);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", a);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", a);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void testAuthor(){
        Article article = new Article("JUnit Rocks", a);

        Assertions.assertEquals("", a.getContact());

        a.setContact("911");

        Assertions.assertEquals("911", a.getContact());
    }
}
