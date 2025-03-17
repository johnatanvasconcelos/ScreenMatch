package com.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import com.screenmatch.exception.ConversionErrorYear;

public class Title implements Comparable<Title> {
    private String title;
    private int year;
    private boolean signatureMovie;
    private double sumRate;
    private int totalRate;
    private int duration;

    public Title(OmdbTitle newTitle) {
        this.title = newTitle.title();

        if (newTitle.year().length() > 4){
            throw new ConversionErrorYear("Não foi possível converter o ano. Mais de quatro caracteres.");
        }
        this.year = Integer.valueOf(newTitle.year());
        this.duration = Integer.valueOf(newTitle.runtime().replaceAll("\\D", ""));

    }

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

    public Title(String title, int year){
        this.setTitle(title);
        this.setYear(year);
    }

    //metodo para mostrar algumas informações gerais do título
    public void showInfo(){
        System.out.println("Title: " + getTitle() + " - " + getYear());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Rate: " + String.format("%.2f", getAverageRate()));
    }

    //metodo que lança uma avaliação para o título pelo usuário
    public void rateMovie(double rate){
        sumRate += rate;
        totalRate++;
    }

    //metodo que retorna a avaliação geral do título
    public double getAverageRate(){
        return sumRate / totalRate;
    }

    @Override
    public String toString() {
        return "Title: " + title + " (" + year + ")";
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getTitle().compareTo(otherTitle.getTitle());
    }
}
