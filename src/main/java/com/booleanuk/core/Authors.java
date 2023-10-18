package com.booleanuk.core;

public class Authors{
    private String name;
    private String contact_information;
    private String website;

    public Authors(String name, String contact_information, String website) {
        this.name = name;
        this.contact_information = contact_information;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "name='" + name + '\'' +
                ", contact_information='" + contact_information + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
