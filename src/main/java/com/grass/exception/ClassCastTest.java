package com.grass.exception;

import java.net.URLDecoder;

import com.grass.generic.Person;

/**
 * Created by baidu on 16/7/13.
 */
public class ClassCastTest {

    public static void main(String[] args) {
        URLDecoder.decode(null);
    }

    public Person getNewInstance() {
        try {
            Class clazz = Void.class;
            return (Person) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
