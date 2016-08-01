package com.grass.generic.wildcard;

import java.util.Arrays;
import java.util.List;

/**
 * Created by grass on 16/7/2.
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> list = Arrays.asList(new Apple());
        Apple apple = (Apple) list.get(0);
        list.contains(new Apple());
        list.indexOf(new Apple());
        Fruit fruit = list.get(1);
    }
}
