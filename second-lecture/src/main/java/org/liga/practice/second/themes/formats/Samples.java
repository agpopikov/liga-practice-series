package org.liga.practice.second.themes.formats;

import java.util.ArrayList;
import java.util.List;

public class Samples {

    public static List<NobelPrizeWinners> getSomeNobelPrizeWinners() {
        List<NobelPrizeWinners> result = new ArrayList<>();
        result.add(new NobelPrizeWinners("Robert Koch", NobelPrizeWinners.Discipline.MEDICINE, 1905));
        result.add(new NobelPrizeWinners("Max Planck", NobelPrizeWinners.Discipline.PHYSICS, 1918));
        result.add(new NobelPrizeWinners("Albert Einstein", NobelPrizeWinners.Discipline.PHYSICS, 1921));
        result.add(new NobelPrizeWinners("Thomas Mann", NobelPrizeWinners.Discipline.LITERATURE, 1929));
        return result;
    }
}
