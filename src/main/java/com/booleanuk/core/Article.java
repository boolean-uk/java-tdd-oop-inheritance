package com.booleanuk.core;

public class Article extends Literature{
	Author author;
    public Article(String title, Author author) {
		super(title);
		this.author=author;
    }

}
