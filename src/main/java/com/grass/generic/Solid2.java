package com.grass.generic;

/**
 * Created by grass on 16/6/30.
 */
public class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T> {
    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }

}
