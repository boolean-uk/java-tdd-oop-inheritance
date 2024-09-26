package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void createArticle(){
        Assertions.assertDoesNotThrow(() -> new Article("tittle1", new Author("name", "2", "www.name1.pl")));
    }

    @Test
    public void getAuthor(){
        Author author = new Author("name", "2", "www.name1.pl");
        Article article = new Article("title1", author);

        Assertions.assertEquals(author, article.getAuthor());
    }
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks", new Author("name1", "1", "www"));
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks", new Author("name1", "1", "www"));
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks", new Author("name1", "1", "www"));
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks", new Author("name1", "1", "www"));

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
