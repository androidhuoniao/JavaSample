package com.grass.generic;

/**
 * Created by grass on 16/6/30.
 */
public class HoldItem<T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
