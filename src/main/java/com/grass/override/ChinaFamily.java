package com.grass.override;

/**
 * Created by grass on 16/6/25.
 */
public class ChinaFamily extends Family {

    @Override
    public Man getMan() {
        return null;
    }

    @Override
    public void addPeople(People p) {
        super.addPeople(p);
    }

    public <T> void getTest() {

    }

    public static void main(String[] args) {
        ChinaFamily cf = new ChinaFamily();
        cf.getTest();
    }
}
