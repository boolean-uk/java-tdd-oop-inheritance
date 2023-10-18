package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemsWithAuthorTest {

    @Test
    public void shouldAuthorBeTolkien() {
        ItemsWithAuthor book = new Book("The Hobbit");
        book.setAuthor(new Author("J.R.R. Tolkien"));

        Assertions.assertEquals("J.R.R. Tolkien", book.getAuthor().getName());
    }

    @Test
    public void shouldAuthorHaveWebsite() {
        ItemsWithAuthor book = new Book("The Hobbit");
        book.setAuthor(new Author("J.R.R. Tolkien", "magicAuthor@gmail.com", "www.magicAuthor.com"));

        Assertions.assertEquals("www.magicAuthor.com", book.getAuthor().getWebsite());
    }

    @Test
    public void shouldAuthorChangeEmail() {
        ItemsWithAuthor book = new Book("The Hobbit");
        book.setAuthor(new Author("J.R.R. Tolkien", "magicAuthor@gmail.com"));
        Assertions.assertEquals("magicAuthor@gmail.com", book.getAuthor().getEmail());
        book.getAuthor().setEmail("magicAuthor@outlook.com");

        Assertions.assertEquals("magicAuthor@outlook.com", book.getAuthor().getEmail());
    }

}
