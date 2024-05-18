package com.catppuccin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oled extends BuiltinPalettes.Mocha {
    @Override
    public Color base() {
        return new Color(0, 0, 0);
    }
}

public class PaletteTests {
    @Test
    public void mochaExistsAndReturnsCorrectDetails() {
        assertEquals("mocha", Palette.MOCHA.name(), "mocha to have the correct name");
    }

    @Test
    public void builtinMochaExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Mocha palette = BuiltinPalettes.MOCHA;
        assertEquals("mocha", palette.name(), "mocha to have the correct name");
    }

    @Test
    public void frappeExistsAndReturnsCorrectDetails() {
        assertEquals("frappe", Palette.FRAPPE.name(), "frappe to have the correct name");
    }

    @Test
    public void builtinFrappeExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Frappe palette = BuiltinPalettes.FRAPPE;
        assertEquals("frappe", palette.name(), "frappe to have the correct name");
    }

    @Test
    public void macchiatoExistsAndReturnsCorrectDetails() {
        assertEquals("macchiato", Palette.MACCHIATO.name(), "macchiato to have the correct name");
    }

    @Test
    public void builtinMacchiatoExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Macchiato palette = BuiltinPalettes.MACCHIATO;
        assertEquals("macchiato", palette.name(), "macchiato to have the correct name");
    }

    @Test
    public void latteExistsAndReturnsCorrectDetails() {
        assertEquals("latte", Palette.LATTE.name(), "latte to have the correct name");
    }

    @Test
    public void builtinLatteExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Latte palette = BuiltinPalettes.LATTE;
        assertEquals("latte", palette.name(), "latte to have the correct name");
    }

    @Test
    public void oledOverridesProperly() {
        Flavor mocha = Palette.MOCHA;
        Flavor oled = new Oled();

        assertEquals(mocha.red(), oled.red(), "oled red and mocha red to be the same");
        assertEquals(new Color(0, 0, 0), oled.base(), "oled base is 0, 0, 0");
        assertNotEquals(mocha.base(), oled.base(), "oled base and mocha base to not be the same");
    }

    @Test
    public void darkLightSet() {
        assertTrue(Palette.MOCHA.isDark(), "mocha to be dark");
        assertFalse(Palette.MOCHA.isLight(), "mocha to be not light");

        assertTrue(Palette.MACCHIATO.isDark(), "macchiato to be dark");
        assertFalse(Palette.MACCHIATO.isLight(), "macchiato to be not light");

        assertTrue(Palette.FRAPPE.isDark(), "frappe to be dark");
        assertFalse(Palette.FRAPPE.isLight(), "frappe to be not light");

        assertTrue(Palette.LATTE.isLight(), "latte to be light");
        assertFalse(Palette.LATTE.isDark(), "latte to be not dark");
    }
}
