package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getArticleAuthorInfo() {
        Article article = new Article("An Adventure to Space");
        Author author = new Author(article,"Neil Degrasse Tyson", "neil.degrasse.tyson@hotmail.com", "www.neildegrassetyson.com");

        String result = "Article: An Adventure to Space" +
                "Author name: Neil Degrasse Tyson" +
                ", Contact information: neil.degrasse.tyson@hotmail.com" +
                ", Website: www.neildegrassetyson.com";

        String expectedResult = author.getArticleAuthorInfo();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void getBookAuthorInfo() {
        Book book = new Book("Lord of the Rings");
        Author author = new Author(book,"JRR Tolkien", "jrr.tolkien@hotmail.com", "www.lordoftherings.com");

        String result = "Book: Lord of the Rings"  +
                "Author name: JRR Tolkien" +
                ", Contact information: jrr.tolkien@hotmail.com" +
                ", Website: www.lordoftherings.com";

        String expectedResult = author.getBookAuthorInfo();

        Assertions.assertEquals(expectedResult, result);
    }
}