package com.grass.generic.test;

import org.junit.Test;

import com.grass.generic.TwoTouple;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by grass on 16/6/25.
 */
public class ToupleTest {

    public TwoTouple<String, Integer> getTwoTouple() {
        return new TwoTouple("", 18);
    }

    public TwoTouple getTwoTouple2() {
        return new TwoTouple(18, 18);
    }

    @Test
    public void testTouple() {
        TwoTouple<String, Integer> twoTouple = getTwoTouple();
        TwoTouple twoTouple2 = getTwoTouple2();
        TwoTouple<String, Integer> twoTouple3 = getTwoTouple2();

        System.out.println(twoTouple.toString());
        System.out.println(twoTouple2.toString());
        System.out.println(twoTouple3.toString());
    }
}
