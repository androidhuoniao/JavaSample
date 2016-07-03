package com.grass.generic.selfbound;

/**
 * Created by grass on 16/7/3.
 */
public class Unconstained {

    public static void main(String[] args) {
        BasicOther b1 = new BasicOther();
        BasicOther b2 = new BasicOther();
        b1.setItem(new Other());
        Other item = b1.getItem();
        b1.f();
    }
}
