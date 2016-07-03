package com.grass.generic.selfbound;

/**
 * Created by grass on 16/7/3.
 */
public class CRGWithBasicHolder {
    public static void main(String[] args) {
        SubType st1 = new SubType();
        SubType st2 = new SubType();
        st1.setItem(st2);
        SubType st3 = st1.getItem();
        st1.f();
    }
}
