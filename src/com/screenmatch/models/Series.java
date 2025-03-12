package com.screenmatch.models;

public class Series extends Title {
    private int episodes;
    private int seasons;
    private boolean active;
    private int minutesPerEpisode;

    public Series(String title, int year) {
        super(title, year);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public void showInfo(){
        System.out.println("Title: " + getTitle() + " - " + getYear());
        System.out.println("Duration: " + getDuration() + " minutes");
        System.out.println("Rate: " + String.format("%.2f", getAverageRate()));
        if(isActive()){
            System.out.println("Status: This series has more seasons on the way");
        }else{
            System.out.println("Status: This series has canceled or is finished");
        }
        System.out.println("Number of seasons: " + getSeasons());
        System.out.println("Number of episodes: " + getEpisodes());
    }

    @Override
    public int getDuration() {
        return episodes * minutesPerEpisode;
    }
}
