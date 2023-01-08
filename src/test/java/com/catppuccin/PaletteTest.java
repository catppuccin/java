package com.catppuccin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PaletteTest {

    @Test
    void successfullyValidatePalette() throws IOException {
        Iterator<Flavour> actualPaletteIterator = Palette.toList().iterator();
        Iterator<JsonNode> expectedPaletteIterator = getPalette().iterator();

        while (actualPaletteIterator.hasNext() && expectedPaletteIterator.hasNext()) {
            Flavour actualPalette = actualPaletteIterator.next();
            JsonNode expectedPalette = expectedPaletteIterator.next();
            Iterator<JsonNode> expectedFlavourIterator = expectedPalette.iterator();
            Iterator<Pair<String, Color>> actualFlavourIterator = actualPalette.toList().iterator();

            while (expectedFlavourIterator.hasNext() && actualFlavourIterator.hasNext()) {
                JsonNode expectedColour = expectedFlavourIterator.next();
                Pair<String, Color> actualColourPair = actualFlavourIterator.next();

                String expectedHex = expectedColour.get("hex").asText();
                String expectedRGB = expectedColour.get("rgb").asText().replaceAll("\\D+", "");
                String actualHex = "#" + actualColourPair.getValue().getHex();
                String actualRGB = Arrays.toString(actualColourPair.getValue().getRGBComponents()).replaceAll("\\D+", "");

                assertThat(actualHex, is(expectedHex));
                assertThat(actualRGB, is(expectedRGB));
            }
        }
    }

    private JsonNode getPalette() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree(new URL("https://raw.githubusercontent.com/catppuccin/palette/main/palette.json"));
    }
}
