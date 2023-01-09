package com.catppuccin;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * This class represents an individual flavour of the Catppuccin v0.2.0 palette.
 * <p>
 * This can either be latte, frappé, macchiato or mocha.
 */
public class Flavour {
    private final List<Pair<String, Color>> colors;
    private final int hash;

    private final String name;
    private final Color rosewater;
    private final Color flamingo;
    private final Color pink;
    private final Color mauve;
    private final Color red;
    private final Color maroon;
    private final Color peach;
    private final Color yellow;
    private final Color green;
    private final Color teal;
    private final Color sky;
    private final Color sapphire;
    private final Color blue;
    private final Color lavender;
    private final Color text;
    private final Color subtext1;
    private final Color subtext0;
    private final Color overlay2;
    private final Color overlay1;
    private final Color overlay0;
    private final Color surface2;
    private final Color surface1;
    private final Color surface0;
    private final Color base;
    private final Color mantle;
    private final Color crust;

    Flavour(
        String name,
        Color rosewater,
        Color flamingo,
        Color pink,
        Color mauve,
        Color red,
        Color maroon,
        Color peach,
        Color yellow,
        Color green,
        Color teal,
        Color sky,
        Color sapphire,
        Color blue,
        Color lavender,
        Color text,
        Color subtext1,
        Color subtext0,
        Color overlay2,
        Color overlay1,
        Color overlay0,
        Color surface2,
        Color surface1,
        Color surface0,
        Color base,
        Color mantle,
        Color crust
    ) {
        this.name = name;
        this.rosewater = rosewater;
        this.flamingo = flamingo;
        this.pink = pink;
        this.mauve = mauve;
        this.red = red;
        this.maroon = maroon;
        this.peach = peach;
        this.yellow = yellow;
        this.green = green;
        this.teal = teal;
        this.sky = sky;
        this.sapphire = sapphire;
        this.blue = blue;
        this.lavender = lavender;
        this.text = text;
        this.subtext1 = subtext1;
        this.subtext0 = subtext0;
        this.overlay2 = overlay2;
        this.overlay1 = overlay1;
        this.overlay0 = overlay0;
        this.surface2 = surface2;
        this.surface1 = surface1;
        this.surface0 = surface0;
        this.base = base;
        this.mantle = mantle;
        this.crust = crust;

        this.colors = Arrays.asList(
            new Pair<>("rosewater", rosewater),
            new Pair<>("flamingo", flamingo),
            new Pair<>("pink", pink),
            new Pair<>("mauve", mauve),
            new Pair<>("red", red),
            new Pair<>("maroon", maroon),
            new Pair<>("peach", peach),
            new Pair<>("yellow", yellow),
            new Pair<>("green", green),
            new Pair<>("teal", teal),
            new Pair<>("sky", sky),
            new Pair<>("sapphire", sapphire),
            new Pair<>("blue", blue),
            new Pair<>("lavender", lavender),
            new Pair<>("text", text),
            new Pair<>("subtext1", subtext1),
            new Pair<>("subtext0", subtext0),
            new Pair<>("overlay2", overlay2),
            new Pair<>("overlay1", overlay1),
            new Pair<>("overlay0", overlay0),
            new Pair<>("surface2", surface2),
            new Pair<>("surface1", surface1),
            new Pair<>("surface0", surface0),
            new Pair<>("base", base),
            new Pair<>("mantle", mantle),
            new Pair<>("crust", crust)
        );

        this.hash = Objects.hash(
            name,
            rosewater,
            flamingo,
            pink,
            mauve,
            red,
            maroon,
            peach,
            yellow,
            green,
            teal,
            sky,
            sapphire,
            blue,
            lavender,
            text,
            subtext1,
            subtext0,
            overlay2,
            overlay1,
            overlay0,
            surface2,
            surface1,
            surface0,
            base,
            mantle,
            crust
        );
    }

    /**
     * @return the name of the flavour (latte, frappé, macchiato or mocha)
     */
    public String getName() {
        return name;
    }

    /**
     * @return {@link Color}
     */
    public Color getRosewater() {
        return rosewater;
    }

    /**
     * @return {@link Color}
     */
    public Color getFlamingo() {
        return flamingo;
    }

    /**
     * @return {@link Color}
     */
    public Color getPink() {
        return pink;
    }

    /**
     * @return {@link Color}
     */
    public Color getMauve() {
        return mauve;
    }

    /**
     * @return {@link Color}
     */
    public Color getRed() {
        return red;
    }

    /**
     * @return {@link Color}
     */
    public Color getMaroon() {
        return maroon;
    }

    /**
     * @return {@link Color}
     */
    public Color getPeach() {
        return peach;
    }

    /**
     * @return {@link Color}
     */
    public Color getYellow() {
        return yellow;
    }

    /**
     * @return {@link Color}
     */
    public Color getGreen() {
        return green;
    }

    /**
     * @return {@link Color}
     */
    public Color getTeal() {
        return teal;
    }

    /**
     * @return {@link Color}
     */
    public Color getSky() {
        return sky;
    }

    /**
     * @return {@link Color}
     */
    public Color getSapphire() {
        return sapphire;
    }

    /**
     * @return {@link Color}
     */
    public Color getBlue() {
        return blue;
    }

    /**
     * @return {@link Color}
     */
    public Color getLavender() {
        return lavender;
    }

    /**
     * @return {@link Color}
     */
    public Color getText() {
        return text;
    }

    /**
     * @return {@link Color}
     */
    public Color getSubtext1() {
        return subtext1;
    }

    /**
     * @return {@link Color}
     */
    public Color getSubtext0() {
        return subtext0;
    }

    /**
     * @return {@link Color}
     */
    public Color getOverlay2() {
        return overlay2;
    }

    /**
     * @return {@link Color}
     */
    public Color getOverlay1() {
        return overlay1;
    }

    /**
     * @return {@link Color}
     */
    public Color getOverlay0() {
        return overlay0;
    }

    /**
     * @return {@link Color}
     */
    public Color getSurface2() {
        return surface2;
    }

    /**
     * @return {@link Color}
     */
    public Color getSurface1() {
        return surface1;
    }

    /**
     * @return {@link Color}
     */
    public Color getSurface0() {
        return surface0;
    }

    /**
     * @return {@link Color}
     */
    public Color getBase() {
        return base;
    }

    /**
     * @return {@link Color}
     */
    public Color getMantle() {
        return mantle;
    }

    /**
     * @return {@link Color}
     */
    public Color getCrust() {
        return crust;
    }

    /**
     * A convenience method to take all the colours and return them in an
     * iterable {@link List}{@code <}{@link Pair}{@code <}{@link String}, {@link Color}{@code >>}
     *
     * @return {@link List}{@code <}{@link Pair}{@code <}{@link String}, {@link Color}{@code >>}
     */
    public List<Pair<String, Color>> toList() {
        return colors;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Flavour that = (Flavour) obj;
        return Objects.equals(this.name, that.name) &&
            Objects.equals(this.rosewater, that.rosewater) &&
            Objects.equals(this.flamingo, that.flamingo) &&
            Objects.equals(this.pink, that.pink) &&
            Objects.equals(this.mauve, that.mauve) &&
            Objects.equals(this.red, that.red) &&
            Objects.equals(this.maroon, that.maroon) &&
            Objects.equals(this.peach, that.peach) &&
            Objects.equals(this.yellow, that.yellow) &&
            Objects.equals(this.green, that.green) &&
            Objects.equals(this.teal, that.teal) &&
            Objects.equals(this.sky, that.sky) &&
            Objects.equals(this.sapphire, that.sapphire) &&
            Objects.equals(this.blue, that.blue) &&
            Objects.equals(this.lavender, that.lavender) &&
            Objects.equals(this.text, that.text) &&
            Objects.equals(this.subtext1, that.subtext1) &&
            Objects.equals(this.subtext0, that.subtext0) &&
            Objects.equals(this.overlay2, that.overlay2) &&
            Objects.equals(this.overlay1, that.overlay1) &&
            Objects.equals(this.overlay0, that.overlay0) &&
            Objects.equals(this.surface2, that.surface2) &&
            Objects.equals(this.surface1, that.surface1) &&
            Objects.equals(this.surface0, that.surface0) &&
            Objects.equals(this.base, that.base) &&
            Objects.equals(this.mantle, that.mantle) &&
            Objects.equals(this.crust, that.crust);
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public String toString() {
        return "Flavour[" +
            "name=" + name + ", " +
            "rosewater=" + rosewater + ", " +
            "flamingo=" + flamingo + ", " +
            "pink=" + pink + ", " +
            "mauve=" + mauve + ", " +
            "red=" + red + ", " +
            "maroon=" + maroon + ", " +
            "peach=" + peach + ", " +
            "yellow=" + yellow + ", " +
            "green=" + green + ", " +
            "teal=" + teal + ", " +
            "sky=" + sky + ", " +
            "sapphire=" + sapphire + ", " +
            "blue=" + blue + ", " +
            "lavender=" + lavender + ", " +
            "text=" + text + ", " +
            "subtext1=" + subtext1 + ", " +
            "subtext0=" + subtext0 + ", " +
            "overlay2=" + overlay2 + ", " +
            "overlay1=" + overlay1 + ", " +
            "overlay0=" + overlay0 + ", " +
            "surface2=" + surface2 + ", " +
            "surface1=" + surface1 + ", " +
            "surface0=" + surface0 + ", " +
            "base=" + base + ", " +
            "mantle=" + mantle + ", " +
            "crust=" + crust +
            ']';
    }

}
