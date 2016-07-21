package com.grass.generic;

/**
 * Created by grass on 16/6/30.
 */
public class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {
    public ColoredDimension2(T item) {
        super(item);
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

}
