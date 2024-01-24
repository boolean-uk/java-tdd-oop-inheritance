package com.booleanuk.core;

public class Author {

    private final String name;
    private final int age;
    private final String website;
    private final int releaseYear;

    public Author(String name, int age, String website, int releaseYear) {
        this.name = name;
        this.age = age;
        this.website = website;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getWebsite() {
        return this.website;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }
}
