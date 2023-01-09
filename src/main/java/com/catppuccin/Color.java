package com.catppuccin;

/**
 * This {@link Color} class extends the existing {@link java.awt.Color} class to add
 * additional utility methods to provide different representations of the existing data.
 */
public class Color extends java.awt.Color {
    /**
     * @see java.awt.Color#Color(int, int, int)
     */
    Color(int r, int g, int b) {
        super(r, g, b);
    }

    /**
     * Converts the components of the chosen colour, as specified by the default RGB
     * model, to an equivalent hexadecimal representation.
     *
     * @return {@link String} containing the hex value of the chosen colour, e.g "1e1e2e"
     */
    public String getHex() {
        return String.format(
            "%02x%02x%02x",
            this.getRed(),
            this.getGreen(),
            this.getBlue()
        );
    }

    /**
     * @return an array of three elements containing the red, green and blue components in
     * the range of 0-255 as specified by the default sRGB space.
     *
     * @see java.awt.Color#getRed()
     * @see java.awt.Color#getGreen()
     * @see java.awt.Color#getBlue()
     * @see java.awt.Color#getRGBColorComponents(float[])
     */
    public int[] getRGBComponents() {
        return new int[]{this.getRed(), this.getGreen(), this.getBlue()};
    }
}
