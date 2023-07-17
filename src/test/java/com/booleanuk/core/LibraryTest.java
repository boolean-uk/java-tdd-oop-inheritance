package com.booleanuk.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Nested
    class LibraryClass {
        @Test
        public void testAddRemoveArticle() {
            Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
            Article article = new Article("Article 1", author);
            library.addToStock(article);

            List<Article> articles = library.getArticles();
            Assertions.assertEquals(1, articles.size());
            Assertions.assertTrue(articles.contains(article));

            library.removeFromStock(article);

            Assertions.assertEquals(0, articles.size());
            Assertions.assertFalse(articles.contains(article));
        }

        @Test
        public void testAddRemoveBook() {
            Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
            Book book = new Book("Book 1", author);
            library.addToStock(book);

            List<Book> books = library.getBooks();
            Assertions.assertEquals(1, books.size());
            Assertions.assertTrue(books.contains(book));

            library.removeFromStock(book);

            Assertions.assertEquals(0, books.size());
            Assertions.assertFalse(books.contains(book));
        }

        @Test
        public void testAddRemoveNewspaper() {
            Newspaper newspaper = new Newspaper("Newspaper 1");
            library.addToStock(newspaper);

            List<Newspaper> newspapers = library.getNewspapers();
            Assertions.assertEquals(1, newspapers.size());
            Assertions.assertTrue(newspapers.contains(newspaper));

            library.removeFromStock(newspaper);

            Assertions.assertEquals(0, newspapers.size());
            Assertions.assertFalse(newspapers.contains(newspaper));
        }

        @Test
        public void testArticleCheckInNotOnLoan() {
            Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
            Article article = new Article("Article 1", author);

            String result = article.checkIn();

            Assertions.assertEquals("item is not currently on loan", result);
        }

        @Test
        public void testArticleCheckInOnLoan() {
            Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
            Article article = new Article("Article 1", author);
            article.checkOut();

            String result = article.checkIn();

            Assertions.assertEquals("item has been checked in", result);
        }

        @Test
        public void testArticleCheckOutNotOnLoan() {
            Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
            Article article = new Article("Article 1", author);

            String result = article.checkOut();

            Assertions.assertEquals("item has been checked out", result);
        }

        @Test
        public void testArticleCheckOutOnLoan() {
            Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
            Article article = new Article("Article 1", author);
            article.checkOut();

            String result = article.checkOut();

            Assertions.assertEquals("item is currently on loan", result);
        }

        @Test
        public void testBookCheckInNotOnLoan() {
            Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
            Book book = new Book("Book 1", author);

            String result = book.checkIn();

            Assertions.assertEquals("item is not currently on loan", result);
        }

        @Test
        public void testBookCheckInOnLoan() {
            Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
            Book book = new Book("Book 1", author);
            book.checkOut();

            String result = book.checkIn();

            Assertions.assertEquals("item has been checked in", result);
        }

        @Test
        public void testBookCheckOutNotOnLoan() {
            Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
            Book book = new Book("Book 1", author);

            String result = book.checkOut();

            Assertions.assertEquals("item has been checked out", result);
        }

        @Test
        public void testBookCheckOutOnLoan() {
            Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
            Book book = new Book("Book 1", author);
            book.checkOut();

            String result = book.checkOut();

            Assertions.assertEquals("item is currently on loan", result);
        }

        @Test
        @DisplayName("Checking in a newspaper")
        public void testNewspaperCheckIn() {
            Newspaper newspaper = new Newspaper("Newspaper 1");

            String result = newspaper.checkIn();

            Assertions.assertEquals("item is not currently on loan", result);
        }

        @Test
        public void testNewspaperCheckOut() {
            Newspaper newspaper = new Newspaper("Newspaper 1");

            String result = newspaper.checkOut();

            Assertions.assertEquals("item has been checked out", result);
        }
    }
}