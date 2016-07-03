package com.grass.generic.lsp;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by grass on 16/7/3.
 */
public class Father {

    public Collection doSomething(HashMap map) {
        System.out.println("father is working");
        return map.values();
    }
}
