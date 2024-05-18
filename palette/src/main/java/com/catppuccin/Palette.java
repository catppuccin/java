package com.catppuccin;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the entirety of the Catppuccin v0.2.0 palette.
 */
@GeneratedPalette(target="com.catppuccin.BuiltinPalettes")
public class Palette 
{
    /**
     * Mocha flavoured Catppuccin
     */
    public static final Flavor MOCHA = com.catppuccin.BuiltinPalettes.MOCHA; 

    /**
     * Macchiato flavoured Catppuccin
     */
    public static final Flavor MACCHIATO = com.catppuccin.BuiltinPalettes.MACCHIATO; 

    /**
     * Frappe flavoured Catppuccin
     */
    public static final Flavor FRAPPE = com.catppuccin.BuiltinPalettes.FRAPPE; 

    /**
     * Latte flavoured Catppuccin
     */
    public static final Flavor LATTE = com.catppuccin.BuiltinPalettes.LATTE; 

    public List<Flavor> toList() {
        List<Flavor> out = new ArrayList<>();

        out.add(MOCHA);
        out.add(MACCHIATO);
        out.add(FRAPPE);
        out.add(LATTE);

        return out;
    }
}
