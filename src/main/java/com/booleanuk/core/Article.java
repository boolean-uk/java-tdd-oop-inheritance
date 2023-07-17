package com.booleanuk.core;


/*
There are some classes and tests in the usual place. It's a basic implementation of a library's collection of books, articles and newspapers, with quite a bit of repetition and redundancy.

Refactor the code base using inheritance to remove the repetition
Modify the existing tests to prove your solution works as intended
Create a test suite for the Library class, as well as any new classes you create
 */
public class Article extends Publication {
    public Article(String title) {
        super(title);
    }
}
