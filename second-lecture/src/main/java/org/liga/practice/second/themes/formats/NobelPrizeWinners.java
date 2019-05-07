package org.liga.practice.second.themes.formats;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class NobelPrizeWinners {

    @JsonProperty("full_name")
    private String name;
    private Discipline discipline;
    private Integer year;
    @JsonFormat(pattern = "MM/dd/YYYY")
    private LocalDate birthday;

    public NobelPrizeWinners() {
        // stub
    }

    public NobelPrizeWinners(String name, Discipline discipline, Integer year, LocalDate birthday) {
        this.name = name;
        this.discipline = discipline;
        this.year = year;
        this.birthday = birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public enum Discipline {
        MEDICINE, PHYSICS, ECONOMICS, LITERATURE;
    }
}
