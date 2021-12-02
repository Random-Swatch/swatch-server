package com.kanopi.swatch;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
public interface Color {

    ColorSpaceType getType();

    Color random();

    String getSyntax();

    boolean getIsCssCompatible();
}
