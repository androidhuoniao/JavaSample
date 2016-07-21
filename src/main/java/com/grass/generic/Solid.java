package com.grass.generic;

import java.awt.Color;

/**
 * Created by grass on 16/6/30.
 */
public class Solid<T extends Dimension & HasColor & Weight> {
    private T item;

    public Solid(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public Color color() {
        return item.getColor();
    }

    public int getX() {
        return item.x;
    }

    public int getY() {
        return item.y;
    }

    public int weight() {
        return item.weight();
    }
}
