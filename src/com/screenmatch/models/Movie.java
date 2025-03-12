package com.screenmatch.models;

import com.screenmatch.calculations.Rateable;

public class Movie extends Title {
    private String director;

    public Movie(String title, int year) {
        super(title, year);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}