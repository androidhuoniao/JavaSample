package com.grass.generic;

import java.awt.Color;

/**
 * Created by grass on 16/6/30.
 */
public class Colored<T extends HasColor> {
    private T item;

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public Color color() {
        return item.getColor();
    }
}
