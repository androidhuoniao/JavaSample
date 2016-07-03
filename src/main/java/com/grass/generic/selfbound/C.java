package com.grass.generic.selfbound;

/**
 * Created by grass on 16/7/3.
 */
public class C extends SelfBounded<C> {

    public C setAndGet(C arg) {
        setItem(arg);
        return getItem();
    }
}
