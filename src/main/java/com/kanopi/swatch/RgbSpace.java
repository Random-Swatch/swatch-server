package com.kanopi.swatch;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
public class RgbSpace implements Color {

    private int red;

    private int green;

    private int blue;

    public RgbSpace() {
    }

    public RgbSpace(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public ColorSpaceType getType() {
        return ColorSpaceType.RGB;
    }

    @Override
    public Color random() {
        return new RgbSpace(
                ThreadLocalRandom.current().nextInt(0, 256),
                ThreadLocalRandom.current().nextInt(0, 256),
                ThreadLocalRandom.current().nextInt(0, 256)
        );
    }

    @Override
    public String getSyntax() {
        return "rgb(" + red + ", " + green + ", " + blue + ")";
    }

    @Override
    public boolean getIsCssCompatible() {
        return true;
    }

    @Override
    public String toString() {
        return "RgbSpace{" +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}