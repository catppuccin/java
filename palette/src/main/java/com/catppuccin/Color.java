package com.catppuccin;

/**
 * This class provides utility methods to provide different representations of the RGB color data.
 */
public class Color {
    private final int r;
    private final int g;
    private final int b;

    /**
     * Generate a Color based on the provided RGB values
     * @param r the red value
     * @param b the green value
     * @param g the blue value
     */
    public Color(int r, int b, int g) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * @return the red component
     */
    public int r() {
        return this.r;
    }

    /**
     * @return the green component
     */
    public int g() {
        return this.g;
    }

    /**
     * @return the blue component
     */
    public int b() {
        return this.b;
    }

    /**
     * @return the color, as a hex string
     */
    public String hex() {
        return String.format("%02x%02x%02x", this.r(), this.g(), this.b());
    }

    /**
     * @return the components of the color as a 3 element array
     */
    public int[] components() {
        return new int[]{
            r(),
            g(),
            b()
        };
    }

    @Override
    public String toString() {
        return "Color{" +
            "r=" + r +
            ", g=" + g +
            ", b=" + b +
            '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Color)) {
            return false;
        }

        Color other = (Color) obj;
        return this.r == other.r && this.g == other.g && this.b == other.b;
    }
}
