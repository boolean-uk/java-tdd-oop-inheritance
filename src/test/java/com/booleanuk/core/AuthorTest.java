package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthorTest {
    @Test
    public void testBookWithAuthor() {
        List<Author> authors = new ArrayList<>() {
            {
                add(new Author("Brian Kernighan"));
                add(new Author("Dennis Ritchie"));
            }
        };
        Book book = new Book("The C programming language", authors);

        Assertions.assertEquals(book.authors(), authors);
    }

    @Test
    public void testArticleWithAuthor() {
        List<Author> authors = new ArrayList<>() {
            {
                add(new Author("DHH"));
            }
        };
        Article article = new Article("Ruby on rails", authors);

        Assertions.assertEquals(article.authors(), authors);
    }
}
