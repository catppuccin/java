package com.catppuccin;

public class Color {
    private int r;
    private int g;
    private int b;

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
