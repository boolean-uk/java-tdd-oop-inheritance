package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<InformationSource> sources;

    public Library() {
        sources = new ArrayList<>(0);
    }

    public void addToStock(InformationSource source) {
        sources.add(source);
    }


    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)

    public String checkInSources(String title) {
        List<InformationSource> filtered = this.sources.stream().filter(source -> source.title.equals(title)).toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }


    public String checkOutSources(String title) {
        List<InformationSource> filtered = this.sources.stream().filter(source -> source.title.equals(title)).toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public List<InformationSource> getSources() {
        return sources;
    }

    public void setSources(List<InformationSource> sources) {
        this.sources = sources;
    }
}
