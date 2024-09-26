package com.booleanuk.core;

public class Newspaper extends Product {

    public Newspaper(String title) {
        super(title);
    }

    @Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }

    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
