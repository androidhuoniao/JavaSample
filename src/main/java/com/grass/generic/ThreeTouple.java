package com.grass.generic;

/**
 * Created by grass on 16/6/25.
 */
public class ThreeTouple<A, B, C> extends TwoTouple<A, B> {
    public final C third;

    public ThreeTouple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return super.toString() + " " + third;
    }
}
