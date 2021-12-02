package com.kanopi.swatch;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
public class HslSpace implements Color {

    private int hue;

    private int saturation;

    private int lightness;

    public HslSpace() {
    }

    public HslSpace(int hue, int saturation, int lightness) {
        this.hue = hue;
        this.saturation = saturation;
        this.lightness = lightness;
    }

    @Override
    public ColorSpaceType getType() {
        return ColorSpaceType.HSL;
    }

    @Override
    public Color random() {
        return new HslSpace(
                ThreadLocalRandom.current().nextInt(0, 360),
                ThreadLocalRandom.current().nextInt(0, 101),
                ThreadLocalRandom.current().nextInt(0, 101)
        );
    }

    @Override
    public String getSyntax() {
        return "hsl(" + hue + ", " + saturation + "%, " + lightness + "%)";
    }

    @Override
    public boolean getIsCssCompatible() {
        return true;
    }

    @Override
    public String toString() {
        return "HslSpace{" +
                "hue=" + hue +
                ", saturation=" + saturation +
                ", lightness=" + lightness +
                '}';
    }
}
