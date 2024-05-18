package com.catppuccin;

public class Color {
    private final int r;
    private final int g;
    private final int b;

    public Color(int r, int b, int g) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int r() {
        return this.r;
    }

    public int g() {
        return this.g;
    }

    public int b() {
        return this.b;
    }

    public String hex() {
        return String.format("%02x%02x%02x", this.r(), this.g(), this.b());
    }

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
