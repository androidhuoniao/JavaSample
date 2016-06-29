package com.grass.generic;

/**
 * Created by grass on 16/6/25.
 */
public class TwoTouple<A, B> {
    public final A first;
    public final B second;

    public TwoTouple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + first + " " + second;
    }
}