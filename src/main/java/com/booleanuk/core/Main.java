package com.booleanuk.core;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "john.doe@example.com",  "123456789", "www.johndoe.com");
        Book book1 = new Book("Book Title", author1);

        System.out.println("Book's Author: " + book1.getAuthor().getName());

        Article article1 = new Article("Article Title", author1);
        System.out.println("Article's Author: " + article1.getAuthor().getName());

        Newspaper newspaper1 = new Newspaper("Newspaper Title");
        System.out.println("Newspaper Title: " + newspaper1.getTitle());
    }
}

