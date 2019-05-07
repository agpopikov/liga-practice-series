package org.liga.practice.first.stdlib;

import org.junit.Test;
import org.liga.practice.first.samples.Band;
import org.liga.practice.first.samples.Bands;
import org.liga.practice.first.samples.Musician;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsUtilsTest {

    @Test
    public void streamAPI() {
        final List<Band> bands = Bands.getBands();
        final List<Musician> x = bands.get(0).getMusicians().stream()
                .filter(m -> !m.getFirstName().toLowerCase().contains("ringo1"))
                .collect(Collectors.toList());
        bands.get(0).getMusicians().stream()
                .filter(m -> m.getFirstName().toLowerCase().contains("ringo"))
                .findFirst()
                .ifPresent(i -> System.out.println("Name is " + i.getFirstName())) ;
//        Function<Band, String> f = Band::getTitle;
//        bands.stream()
//                .map(f)
//                .forEach(this::printTitle);
    }

    private void printTitle(String value) {
        System.out.println("New way to print title - " + value);
    }
}
