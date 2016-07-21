package com.grass.generic;

import java.awt.Color;

/**
 * Created by grass on 16/6/30.
 */
public class ColordDimension<T extends Dimension & HasColor> {
    private T item;

    public ColordDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    public int getX() {
        return item.x;
    }

    public int getY() {
        return item.y;
    }
}
