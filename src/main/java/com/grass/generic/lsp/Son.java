package com.grass.generic.lsp;

import java.util.Collection;
import java.util.Map;

/**
 * Created by grass on 16/7/3.
 */
public class Son extends Father {

    public Collection doSomething(Map map) {
        System.out.println("son is working");
        return map.values();
    }
}
