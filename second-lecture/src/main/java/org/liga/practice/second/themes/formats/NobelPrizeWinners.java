package org.liga.practice.second.themes.formats;

import lombok.Data;


public class NobelPrizeWinners {

    private String name;
    private Discipline discipline;
    private Integer year;

    public NobelPrizeWinners() {
        // stub
    }

    public NobelPrizeWinners(String name, Discipline discipline, Integer year) {
        this.name = name;
        this.discipline = discipline;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public enum Discipline {
        MEDICINE, PHYSICS, ECONOMICS, LITERATURE;
    }
}
