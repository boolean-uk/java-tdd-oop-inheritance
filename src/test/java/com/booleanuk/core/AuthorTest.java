package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    @Test
    public void testGetters(){
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        Assertions.assertEquals("A. Author", author.getName());
        Assertions.assertEquals("author@author.com", author.getEmail());
        Assertions.assertEquals("www.author.com", author.getWebsite());
    }

    @Test
    public void testSetters(){
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        author.setName("Other Author");
        Assertions.assertEquals("Other Author", author.getName());
        author.setEmail("o_author@author.com");
        Assertions.assertEquals("o_author@author.com", author.getEmail());
        author.setWebsite("www.otherauthor.com");
        Assertions.assertEquals("www.otherauthor.com", author.getWebsite());
    }
}
