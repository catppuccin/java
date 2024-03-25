package com.catppuccin.palette;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the entirety of the Catppuccin v0.2.0 palette.
 */
public class Palette {
    /**
     * Latte flavoured Catppuccin
     */
    public static final Flavour LATTE = new Flavour(
        "latte",
        new Color(220, 138, 120),
        new Color(221, 120, 120),
        new Color(234, 118, 203),
        new Color(136, 57, 239),
        new Color(210, 15, 57),
        new Color(230, 69, 83),
        new Color(254, 100, 11),
        new Color(223, 142, 29),
        new Color(64, 160, 43),
        new Color(23, 146, 153),
        new Color(4, 165, 229),
        new Color(32, 159, 181),
        new Color(30, 102, 245),
        new Color(114, 135, 253),
        new Color(76, 79, 105),
        new Color(92, 95, 119),
        new Color(108, 111, 133),
        new Color(124, 127, 147),
        new Color(140, 143, 161),
        new Color(156, 160, 176),
        new Color(172, 176, 190),
        new Color(188, 192, 204),
        new Color(204, 208, 218),
        new Color(239, 241, 245),
        new Color(230, 233, 239),
        new Color(220, 224, 232)
    );
    /**
     * Frappé flavoured Catppuccin
     */
    public static final Flavour FRAPPE = new Flavour(
        "frappe",
        new Color(242, 213, 207),
        new Color(238, 190, 190),
        new Color(244, 184, 228),
        new Color(202, 158, 230),
        new Color(231, 130, 132),
        new Color(234, 153, 156),
        new Color(239, 159, 118),
        new Color(229, 200, 144),
        new Color(166, 209, 137),
        new Color(129, 200, 190),
        new Color(153, 209, 219),
        new Color(133, 193, 220),
        new Color(140, 170, 238),
        new Color(186, 187, 241),
        new Color(198, 208, 245),
        new Color(181, 191, 226),
        new Color(165, 173, 206),
        new Color(148, 156, 187),
        new Color(131, 139, 167),
        new Color(115, 121, 148),
        new Color(98, 104, 128),
        new Color(81, 87, 109),
        new Color(65, 69, 89),
        new Color(48, 52, 70),
        new Color(41, 44, 60),
        new Color(35, 38, 52)
    );
    /**
     * Macchiato flavoured Catppuccin
     */
    public static final Flavour MACCHIATO = new Flavour(
        "macchiato",
        new Color(244, 219, 214),
        new Color(240, 198, 198),
        new Color(245, 189, 230),
        new Color(198, 160, 246),
        new Color(237, 135, 150),
        new Color(238, 153, 160),
        new Color(245, 169, 127),
        new Color(238, 212, 159),
        new Color(166, 218, 149),
        new Color(139, 213, 202),
        new Color(145, 215, 227),
        new Color(125, 196, 228),
        new Color(138, 173, 244),
        new Color(183, 189, 248),
        new Color(202, 211, 245),
        new Color(184, 192, 224),
        new Color(165, 173, 203),
        new Color(147, 154, 183),
        new Color(128, 135, 162),
        new Color(110, 115, 141),
        new Color(91, 96, 120),
        new Color(73, 77, 100),
        new Color(54, 58, 79),
        new Color(36, 39, 58),
        new Color(30, 32, 48),
        new Color(24, 25, 38)
    );
    /**
     * Mocha flavoured Catppuccin
     */
    public static final Flavour MOCHA = new Flavour(
        "mocha",
        new Color(245, 224, 220),
        new Color(242, 205, 205),
        new Color(245, 194, 231),
        new Color(203, 166, 247),
        new Color(243, 139, 168),
        new Color(235, 160, 172),
        new Color(250, 179, 135),
        new Color(249, 226, 175),
        new Color(166, 227, 161),
        new Color(148, 226, 213),
        new Color(137, 220, 235),
        new Color(116, 199, 236),
        new Color(137, 180, 250),
        new Color(180, 190, 254),
        new Color(205, 214, 244),
        new Color(186, 194, 222),
        new Color(166, 173, 200),
        new Color(147, 153, 178),
        new Color(127, 132, 156),
        new Color(108, 112, 134),
        new Color(88, 91, 112),
        new Color(69, 71, 90),
        new Color(49, 50, 68),
        new Color(30, 30, 46),
        new Color(24, 24, 37),
        new Color(17, 17, 27)
    );

    private Palette() {

    }

    /**
     * A convenience method to take all the flavours and return them in an
     * iterable {@link List}{@code <}{@link Flavour}{@code >}
     *
     * @return {@link List}{@code <}{@link Flavour}{@code >}
     */
    public static List<Flavour> toList() {
        List<Flavour> flavours = new ArrayList<>();
        flavours.add(LATTE);
        flavours.add(FRAPPE);
        flavours.add(MACCHIATO);
        flavours.add(MOCHA);
        return flavours;
    }
}
