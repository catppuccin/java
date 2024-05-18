package com.catppuccin;

import java.util.List;

public interface Flavor {

    /**
     * @return the name of the flavour (latte, frappe, macchiato or mocha)
     */
    String name();

    /**
     * @return the emoji that represents the flavor
     */
    String emoji();

    /**
     * @return whether this flavor is a designed for light mode
     */
    boolean isLight();

    /**
     * @return whether this flavor is a designed for dark mode
     */
    boolean isDark();


    /**
     * A convenience method to take all the colours and return them in aniterable {@link java.util.List}{@code <}{@link com.catppuccin.Pair}{@code <}{@link String}, {@link com.catppuccin.Color}{@code >>}
     * @return {@link java.util.List}{@code <}{@link com.catppuccin.Pair}{@code <}{@link String}, {@link com.catppuccin.Color}{@code >>}
     */
    List<Pair<String, Color>> toList();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color rosewater();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color flamingo();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color pink();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color mauve();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color red();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color maroon();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color peach();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color yellow();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color green();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color teal();

    /**
     * @return {@link com.catppuccin.Color}
     */
    Color sky();

    /**
     * @return {@link com.catppuccin.Color}
     */
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color sapphire();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color blue();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color lavender();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color text();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color subtext1();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color subtext0();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color overlay2();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color overlay1();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color overlay0();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color surface2();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color surface1();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color surface0();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color base();
    /**

     * @return {@link com.catppuccin.Color}
     */
    Color mantle();
    /**
     * @return {@link com.catppuccin.Color}
     */
    Color crust();
 
   /**
     * @return {@link com.catppuccin.Color}
     */
}