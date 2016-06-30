package com.grass.generic;

import java.awt.Color;

/**
 * Created by grass on 16/6/30.
 */
public class Colored2<T extends HasColor> extends HoldItem<T> {
    public Colored2(T item) {
        super(item);
    }

    public Color color() {
        return item.getColor();
    }
}
