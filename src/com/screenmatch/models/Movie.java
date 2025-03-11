package com.screenmatch.models;

import com.screenmatch.calculations.Rateable;

public class Movie extends Title {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return getTitle() + " (" + getYear() + ")";
    }
}