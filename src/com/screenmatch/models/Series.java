package com.screenmatch.models;

public class Serie extends Title {
    private int episodes;
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

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

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
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
            System.out.println("This series have more seasons on the way");
        }else{
            System.out.println("no more seasons");
        }
        System.out.println("Active: " + isActive());
    }

    @Override
    public int getDuration() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
