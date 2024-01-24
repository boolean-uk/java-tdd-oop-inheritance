package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {



    @Test
    public void testAuthorInit() {

        Author author = new Author("name1", "+0000000000", "Website");

        Assertions.assertEquals("name1", author.getName());
        Assertions.assertEquals("+0000000000", author.getPhonenumber());
        Assertions.assertEquals("Website", author.getWebsite());


    }
}
