package org.liga.practice.second;

import org.liga.practice.second.themes.formats.Samples;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        String tool = "slf4j";
        log.trace("Trace message");
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warn message");
        try {
            Samples.getSomeNobelPrizeWinners();
        } catch (Exception e) {
            log.error("Error occurred", e);
        }
    }
}
