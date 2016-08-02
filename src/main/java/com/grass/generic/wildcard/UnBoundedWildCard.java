package com.grass.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grass on 16/8/1.
 */
public class UnBoundedWildCard {
    public static void main(String[] args) {
        List<?> list = null;
        list = new ArrayList<Orange>();
        list = new ArrayList<Apple>();

        //                list.add(new Orange());
        //        list.add(new Apple());
        //        list.add(new Object());

        //        List<? extends Orange> oranges = new ArrayList<Orange>();
        //        oranges.add(new Orange());
        //        oranges.add(new Object());

//        List<String>[] stringList = new ArrayList<String>[1];
//        List<Integer> intlist = Arrays.asList(10);
//        Object[] objects = new Object[10];
//        objects = stringList;
//        objects[1] = intlist;
//        String s = stringList[0].get(0);
    }

}
