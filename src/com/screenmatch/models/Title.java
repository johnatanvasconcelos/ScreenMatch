package com.screenmatch.models;

public class Title {
    private String title;
    private int year;
    private boolean signatureMovie;
    private double sumRate;
    private int totalRate;
    private int duration;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSignatureMovie() {
        return signatureMovie;
    }

    public void setSignatureMovie(boolean signatureMovie) {
        this.signatureMovie = signatureMovie;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalRate(){
        return totalRate;
    }

    public void showInfo(){
        System.out.println("Movie: " + title + " - " + year);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rate: " + sumRate);
    }

    public void rateMovie(double rate){
        sumRate += rate;
        totalRate++;
    }

    public double getAverageRate(){
        return sumRate / totalRate;
    }
}
