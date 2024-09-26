package com.booleanuk.core;

import java.util.Objects;

public record Author(String name, String contactInformation, String website) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Author) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.contactInformation, that.contactInformation) &&
                Objects.equals(this.website, that.website);
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name + ", " +
                "contactInformation=" + contactInformation + ", " +
                "website=" + website + ']';
    }


}
