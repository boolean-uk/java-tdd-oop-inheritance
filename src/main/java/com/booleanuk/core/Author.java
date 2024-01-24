package com.booleanuk.core;

public class Author {

    String name;

    String contactInformation;

    String website;

    Article article;
    Book book;
    Newspaper newspaper;

    public Author(Article article, String name, String contactInformation, String website) {
        this.article = article;
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }
    public Author(Book book, String name, String contactInformation, String website) {
        this.book = book;
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }

    public String getArticleAuthorInfo() {
        return "Article: " + article.title +
                "Author name: " + this.name +
                ", Contact information: " + this.contactInformation +
                ", Website: " + this.website;
    }

    public String getBookAuthorInfo() {
        return "Book: " + book.title +
                "Author name: " + this.name +
                ", Contact information: " + this.contactInformation +
                ", Website: " + this.website;
    }
}
