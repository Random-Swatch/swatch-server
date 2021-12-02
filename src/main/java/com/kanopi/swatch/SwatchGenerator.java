package com.kanopi.swatch;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
public class SwatchGenerator {

    private final static List<Color> colorSpaces = new LinkedList<>();

    private final static int SWATCH_SIZE = 5;

    public SwatchGenerator() {
        colorSpaces.add(new RgbSpace());
        colorSpaces.add(new HslSpace());
    }

    public List<Color> generate() throws NoColorSpacesFoundException {
        if (colorSpaces.isEmpty()) {
            throw new NoColorSpacesFoundException();
        }

        final LinkedList<Color> colors = new LinkedList<>();

        for (int i = 0; i < SWATCH_SIZE; i++) {
            final int randomColorSpaceIndex = ThreadLocalRandom.current().nextInt(0, colorSpaces.size());
            colors.add(colorSpaces.get(randomColorSpaceIndex).random());
        }

        return colors;
    }
}
