package com.screenmatch.calculations;

import com.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title t) {
        totalTime += t.getDuration();
    }
}
