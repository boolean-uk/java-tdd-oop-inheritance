package com.booleanuk.core;

public class Newspaper extends Item{

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

    public String getAuthorInformation() {
        return "Can't provide author on a newspaper";

    }
}


