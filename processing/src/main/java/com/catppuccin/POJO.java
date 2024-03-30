package com.catppuccin;

import java.util.Map;

public class POJO {
    public static class Root {
        public Flavor latte;
        public Flavor frappe;
        public Flavor macchiato;
        public Flavor mocha;

        @Override
        public String toString() {
            return "Root{" +
                "latte=" + latte +
                ", frappe=" + frappe +
                ", macchiato=" + macchiato +
                ", mocha=" + mocha +
                '}';
        }
    }

    public class Flavor {
        private String name;
        private long order;
        private boolean dark;
        private Map<String, Color> colors;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public long getOrder() {
            return order;
        }

        public void setOrder(long value) {
            this.order = value;
        }

        public boolean isDark() {
            return dark;
        }

        public boolean isLight() {
            return !isDark();
        }

        public void setDark(boolean value) {
            this.dark = value;
        }

        public Map<String, Color> getColors() {
            return colors;
        }

        public void setColors(Map<String, Color> value) {
            this.colors = value;
        }

        @Override
        public String toString() {
            return "Flavor{" +
                "name='" + name + '\'' +
                ", order=" + order +
                ", dark=" + dark +
                ", colors=" + colors +
                '}';
        }
    }

    public class Color {
        private String name;
        private long order;
        private String hex;
        private RGB rgb;
        private Hsl hsl;
        private boolean accent;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public long getOrder() {
            return order;
        }

        public void setOrder(long value) {
            this.order = value;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String value) {
            this.hex = value;
        }

        public RGB getRGB() {
            return rgb;
        }

        public void setRGB(RGB value) {
            this.rgb = value;
        }

        public Hsl getHsl() {
            return hsl;
        }

        public void setHsl(Hsl value) {
            this.hsl = value;
        }

        public boolean getAccent() {
            return accent;
        }

        public void setAccent(boolean value) {
            this.accent = value;
        }

        @Override
        public String toString() {
            return "Color{" +
                "name='" + name + '\'' +
                ", order=" + order +
                ", hex='" + hex + '\'' +
                ", rgb=" + rgb +
                ", hsl=" + hsl +
                ", accent=" + accent +
                '}';
        }
    }

    public class Hsl {
        private double h;
        private double s;
        private double l;

        public double getH() {
            return h;
        }

        public void setH(double value) {
            this.h = value;
        }

        public double getS() {
            return s;
        }

        public void setS(double value) {
            this.s = value;
        }

        public double getL() {
            return l;
        }

        public void setL(double value) {
            this.l = value;
        }

        @Override
        public String toString() {
            return "Hsl{" +
                "h=" + h +
                ", s=" + s +
                ", l=" + l +
                '}';
        }
    }

    public class RGB {
        private int r;
        private int g;
        private int b;

        public int getR() {
            return r;
        }

        public void setR(int value) {
            this.r = value;
        }

        public int getG() {
            return g;
        }

        public void setG(int value) {
            this.g = value;
        }

        public int getB() {
            return b;
        }

        public void setB(int value) {
            this.b = value;
        }

        @Override
        public String toString() {
            return "RGB{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
        }
    }
}
