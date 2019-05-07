package org.liga.practice.first.samples;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Bands {

    public static List<Band> getBands() {
        ArrayList<Band> bands = new ArrayList<>();
        Band beatles = new Band("Beatles");
        beatles.getMusicians().add(new Musician("John", "Lennon", LocalDate.of(1940, Month.OCTOBER, 9)));
        beatles.getMusicians().add(new Musician("Paul", "McCartney", LocalDate.of(1942, Month.JUNE, 18)));
        beatles.getMusicians().add(new Musician("Ringo", "Starr", LocalDate.of(1940, Month.JULY, 7)));
        beatles.getMusicians().add(new Musician("George", "Harrison", LocalDate.of(1943, Month.FEBRUARY, 25)));
        bands.add(beatles);
        return bands;
    }
}
