package com.catppuccin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Testable
class PaletteTest {
    private static final String PALETTE_URL =
        "https://raw.githubusercontent.com/catppuccin/palette/ec883a880bc24d43a01c78e7d9602abf6b1780dd/palette.json";

    @Test
    void successfullyValidatePalette() throws IOException {
        Iterator<Flavour> actualPaletteIter = Palette.toList().iterator();
        Iterator<JsonNode> expectedPaletteIter = getPalette().iterator();

        while (actualPaletteIter.hasNext() && expectedPaletteIter.hasNext()) {
            Flavour actualPalette = actualPaletteIter.next();
            JsonNode expectedPalette = expectedPaletteIter.next();
            Iterator<JsonNode> expectedFlavourIter = expectedPalette.iterator();
            Iterator<Pair<String, Color>> actualFlavourIter =
                actualPalette.toList().iterator();

            while (expectedFlavourIter.hasNext() && actualFlavourIter.hasNext()) {
                JsonNode expectedColour = expectedFlavourIter.next();
                Pair<String, Color> actualColourPair =
                    actualFlavourIter.next();

                String expectedHex = expectedColour.get("hex").asText();
                String expectedRGB = expectedColour.get("rgb").asText()
                    .replaceAll("\\D+", "");
                String actualHex = "#" + actualColourPair.getValue().getHex();
                String actualRGB = Arrays.toString(
                    actualColourPair.getValue().getRGBComponents()
                ).replaceAll("\\D+", "");

                assertThat(actualHex, is(expectedHex));
                assertThat(actualRGB, is(expectedRGB));
            }
        }
    }

    private JsonNode getPalette() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree(new URL(PALETTE_URL));
    }
}
