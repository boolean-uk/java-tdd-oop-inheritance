package com.booleanuk.core;

public class Author {
    private String name;
    private int phoneNumber;
    private String http;

    public Author(String name, int phoneNumber, String http) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setHttp(http);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
    }
}
