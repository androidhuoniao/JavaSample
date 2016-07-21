package com.grass.generic.wildcard;

import java.util.List;

/**
 * Created by grass on 16/7/2.
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
       // compie error
//        apples.add(new Orange());
    }
}
