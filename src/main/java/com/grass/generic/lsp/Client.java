package com.grass.generic.lsp;

import java.util.HashMap;

/**
 * Created by grass on 16/7/3.
 */
public class Client {
    public static void main(String[] args) {
        Father f = new Father();
        HashMap map = new HashMap();
        f.doSomething(map);

        Son son = new Son();
        son.doSomething(map);
    }
}
