package com.catppuccin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

class Oled extends BuiltinPalettes.Mocha {
    @Override
    public Color base() {
        return new Color(0, 0, 0);
    }
}

public class PaletteTests {
    @Test
    public void mochaExistsAndReturnsCorrectDetails() {
        assertEquals("mocha to have the correct name", "mocha", Palette.MOCHA.name());
    }

    @Test
    public void builtinMochaExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Mocha palette = BuiltinPalettes.MOCHA;
        assertEquals("mocha to have the correct name", "mocha", palette.name());
    }

    @Test
    public void frappeExistsAndReturnsCorrectDetails() {
        assertEquals("frappe to have the correct name", "frappe", Palette.FRAPPE.name());
    }

    @Test
    public void builtinFrappeExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Frappe palette = BuiltinPalettes.FRAPPE;
        assertEquals("frappe to have the correct name", "frappe", palette.name());
    }

    @Test
    public void macchiatoExistsAndReturnsCorrectDetails() {
        assertEquals("macchiato to have the correct name", "macchiato", Palette.MACCHIATO.name());
    }

    @Test
    public void builtinMacchiatoExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Macchiato palette = BuiltinPalettes.MACCHIATO;
        assertEquals("macchiato to have the correct name", "macchiato", palette.name());
    }

    @Test
    public void latteExistsAndReturnsCorrectDetails() {
        assertEquals("latte to have the correct name", "latte", Palette.LATTE.name());
    }

    @Test
    public void builtinLatteExistsAndReturnsCorrectDetails() {
        BuiltinPalettes.Latte palette = BuiltinPalettes.LATTE;
        assertEquals("latte to have the correct name", "latte", palette.name());
    }

    @Test
    public void oledOverridesProperly() {
        Flavor mocha = Palette.MOCHA;
        Flavor oled = new Oled();

        assertEquals("oled red and mocha red to be the same", mocha.red(), oled.red());
        assertEquals("oled base is 0, 0, 0", new Color(0, 0, 0), oled.base());
        assertNotEquals("oled base and mocha base to not be the same", mocha.base(), oled.base());
    }
}
