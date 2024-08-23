package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    public AuthorTest() {

    }

    @Test
    public void getAuthorInformation() {
        Article article = new Article("JUnit Rocks", new Author("Max", "max1337@gmail.com", "maxolofsson.se"));

        Assertions.assertEquals(article.getAuthor().getEmail(), "max1337@gmail.com");
        Assertions.assertEquals(article.getAuthor().getName(), "Max");
        Assertions.assertEquals(article.getAuthor().getWebsite(), "maxolofsson.se");
    }

}
