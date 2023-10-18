package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    public void shouldReturnCorrectName(){
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");
        Assertions.assertEquals("Author 1", author1.getName());
    }
    @Test
    public void shouldReturnCorrectContactInformation(){
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");
        Assertions.assertEquals("author1@mail.com", author1.getContactInformation());
    }
    @Test
    public void shouldReturnCorrectWebsite(){
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");
        Assertions.assertEquals("www.author1.com", author1.getWebsite());
    }


}
