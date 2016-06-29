package com.grass.generic.test;

import org.junit.Test;

import com.grass.generic.TwoTouple;

/**
 * Created by grass on 16/6/25.
 */
public class GenericTest {

    @Test
    public void testTwoTouple() {
        TwoTouple<String, Integer> stringIntegerTwoTouple = new TwoTouple<String, Integer>("grass",29);
        System.out.println(stringIntegerTwoTouple.toString());
    }
}
