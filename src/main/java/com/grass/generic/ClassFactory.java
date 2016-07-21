package com.grass.generic;

import java.util.HashMap;

/**
 * Created by grass on 16/7/3.
 */
public class ClassFactory {
    public static <T> T getInstance(Class<T> tClass) {
        try {
            return tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap map = getInstance(HashMap.class);
    }
}
