package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class AuthorTest {


    @Test
    void toStringTest() throws Exception {
        Author author = new Author("John Smith", "mail@mail.com", "111222333", "website.com");
        Assertions.assertEquals(author.toString(), "Author{name='John Smith', email='mail@mail.com', phoneNumber='111222333', website='website.com'}");

    }

    @Test
    void constructorTest_IfEmailIsInvalid(){
        Assertions.assertThrows(Exception.class, () -> new Author("John Smith", "mail.com", "111222333", "website.com"), "Email have to contain @");
    }

    @Test
    void constructorTest_IfPhoneNumberIsInvalid(){
        Assertions.assertThrows(Exception.class, () -> new Author("John Smith", "m@ail.com", "1222333", "website.com"), "Phone number have to contain 9 numbers");
    }

    @Test
    void constructorTest_IfWebsiteIsInvalid(){
        Assertions.assertThrows(Exception.class, () -> new Author("John Smith", "m@ail.com", "111222333", "website"), "Invalid website");
    }
}
