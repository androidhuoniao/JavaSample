package com.grass.generic.selfbound;

/**
 * Created by grass on 16/7/3.
 */
public class SelfBounded<T extends SelfBounded<T>> {

    private T item;

    public T getItem() {
        return item;
    }

    public SelfBounded<T> setItem(T item) {
        this.item = item;
        return this;
    }

}
