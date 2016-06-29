package com.grass.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by grass on 16/6/25.
 */
public class Generators {

    public static <E> Collection<E> fill(Collection<E> coll, Generator<E> generator, int n) {
        int index = 0;
        while (index < n) {
            coll.add(generator.next());
            index++;
        }
        return coll;
    }

    public static <T> Collection<T> fill() {
        return null;
    }

    public static void main(String[] args) {
        fill(new ArrayList<String>(), new StringGenerator(), 10);
//        fill(new ArrayList<String>(), new PersonGenerator(), 10);

    }
}
