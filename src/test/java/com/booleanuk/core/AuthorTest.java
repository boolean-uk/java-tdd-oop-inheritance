package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    public void testAuthorGetters(){
        Author author = new Author("John Smith", "90058762", "example@domain.com", "AuthorsWebsite.com");
        Assertions.assertEquals("John Smith", author.getName());
        Assertions.assertEquals("90058762", author.getPhoneNumber());
        Assertions.assertEquals("example@domain.com", author.getEmail());
        Assertions.assertEquals("AuthorsWebsite.com", author.getWebsite());
    }
    @Test
    public void testAuthorInArticle(){
        Author author = new Author("John Smith", "90058762", "example@domain.com", "AuthorsWebsite.com");
        Article article = new Article("A way home", author);
        Assertions.assertEquals("example@domain.com", article.author.getEmail());
    }
    @Test
    public void testAuthorInBook(){
        Author author = new Author("John Smith", "90058762", "example@domain.com", "AuthorsWebsite.com");
        Book book = new Book("Tarkov Shooter", author);
        Assertions.assertEquals("John Smith", book.author.getName());
    }


}
