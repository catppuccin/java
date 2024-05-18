package com.catppuccin;

import java.util.List;

public interface Flavor {
    String name();
    String emoji();
    boolean isDark();
    boolean isLight();
    List<Pair<String, Color>> toList();

    Color rosewater();
    Color flamingo();
    Color pink();
    Color mauve();
    Color red();
    Color maroon();
    Color peach();
    Color yellow();
    Color green();
    Color teal();
    Color sky();
    Color sapphire();
    Color blue();
    Color lavender();
    Color text();
    Color subtext1();
    Color subtext0();
    Color overlay2();
    Color overlay1();
    Color overlay0();
    Color surface2();
    Color surface1();
    Color surface0();
    Color base();
    Color mantle();
    Color crust();
}