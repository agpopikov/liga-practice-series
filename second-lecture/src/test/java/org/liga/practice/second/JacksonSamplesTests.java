package org.liga.practice.second;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.Test;
import org.liga.practice.second.themes.formats.NobelPrizeWinners;
import org.liga.practice.second.themes.formats.Samples;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonSamplesTests {

    @Test
    public void serializationSample() throws JsonProcessingException {
        final List<NobelPrizeWinners> sample = Samples.getSomeNobelPrizeWinners();
        String json = Utils.getObjectMapper().writeValueAsString(sample);
        System.out.println("Result is " + json);
    }

    @Test
    public void deserializationSample() throws IOException {
        String json = "{\"name\":\"Robert Koch\",\"discipline\":\"MEDICINE\",\"year\":1905}";
        NobelPrizeWinners result = Utils.getObjectMapper().readValue(json, NobelPrizeWinners.class);
        Assert.assertEquals("Robert Koch", result.getName());
    }

    @Test
    public void customStructureSample() throws IOException {
        JsonNode root = Utils.getObjectMapper().readTree(new File("./samples/sample-meteorite-landings.json"));
        root.forEach(node -> {
//            node.
        });
    }
}
