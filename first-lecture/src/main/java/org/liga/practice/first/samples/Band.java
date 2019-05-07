package org.liga.practice.first.samples;

import java.util.ArrayList;
import java.util.List;

public class Band {

    private String title;
    private List<Musician> musicians;

    public Band(String title) {
        this.title = title;
        this.musicians = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }
}
