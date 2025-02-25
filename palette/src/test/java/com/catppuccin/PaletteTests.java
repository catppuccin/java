package com.catppuccin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Oled extends BuiltinPalettes.Mocha {
    @Override
    public Color base() {
        return new Color(0, 0, 0);
    }
}

public class PaletteTests {

    private static Stream<Arguments> provideFlavors() {
        return Stream.of(
            Arguments.of(Palette.MOCHA, "mocha", "1e1e2e", 30, 30, 46),
            Arguments.of(Palette.FRAPPE, "frappe", "303446", 48, 52, 70),
            Arguments.of(Palette.MACCHIATO, "macchiato", "24273a", 36, 39, 58),
            Arguments.of(Palette.LATTE, "latte", "eff1f5", 239, 241, 245)
        );
    }

    @ParameterizedTest
    @MethodSource("provideFlavors")
    public void flavorExistsAndReturnsCorrectDetails(Flavor flavor, String name, String hex, int r, int g, int b) {
        assertEquals(name, flavor.name(), name + " to have the correct name");
        assertEquals(hex, flavor.base().hex());
        assertEquals(r, flavor.base().r());
        assertEquals(g, flavor.base().g());
        assertEquals(b, flavor.base().b());
        assertArrayEquals(new int[]{r, g, b}, flavor.base().components());
    }

    @Test
    public void oledOverridesProperly() {
        Flavor mocha = Palette.MOCHA;
        Flavor oled = new Oled();

        assertEquals(mocha.red(), oled.red(), "oled red and mocha red to be the same");
        assertEquals(new Color(0, 0, 0), oled.base(), "oled base is 0, 0, 0");
        assertNotEquals(mocha.base(), oled.base(), "oled base and mocha base to not be the same");
    }

    @ParameterizedTest
    @MethodSource("provideDarkLightFlavors")
    public void darkLightSet(Flavor flavor, boolean isDark, boolean isLight) {
        assertEquals(isDark, flavor.isDark(), flavor.name() + " to be dark");
        assertEquals(isLight, flavor.isLight(), flavor.name() + " to be light");
    }

    private static Stream<Arguments> provideDarkLightFlavors() {
        return Stream.of(
            Arguments.of(Palette.MOCHA, true, false),
            Arguments.of(Palette.MACCHIATO, true, false),
            Arguments.of(Palette.FRAPPE, true, false),
            Arguments.of(Palette.LATTE, false, true)
        );
    }
}
