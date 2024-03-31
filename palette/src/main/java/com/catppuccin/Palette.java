package com.catppuccin;

import java.util.ArrayList;
import java.util.List;

@GeneratedPalette(target="com.catppuccin.BuiltinPalettes")
public class Palette 
{
    public static final Flavor MOCHA = com.catppuccin.BuiltinPalettes.MOCHA; 
    public static final Flavor MACCHIATO = com.catppuccin.BuiltinPalettes.MACCHIATO; 
    public static final Flavor FRAPPE = com.catppuccin.BuiltinPalettes.FRAPPE; 
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
