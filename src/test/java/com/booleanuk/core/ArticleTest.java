package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {

    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldCreateArticleWithAuthor() {
        Author author = new Author("Author", "123123123", "author.com");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals(author, article.getAuthor());
    }
}
