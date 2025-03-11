package com.screenmatch.models;

import com.screenmatch.calculations.Rateable;

public class Episode implements Rateable {
    private int number;
    private String title;
    private Series serie;
    private int totalViews;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Series getSerie() {
        return serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public void showInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("This is the episode number " + getNumber() + " of the series " + getSerie().getTitle());
        System.out.println("Views: " + getTotalViews());

    }

    @Override
    public int getRating() {
        if (totalViews >= 100){
            return 4;
        }else{
            return 2;
        }
    }
}
