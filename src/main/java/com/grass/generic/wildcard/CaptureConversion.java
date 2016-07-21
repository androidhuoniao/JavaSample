package com.grass.generic.wildcard;

/**
 * Created by grass on 16/7/2.
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T value = holder.getValue();
        System.out.println(value.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        f1(holder);
    }

}
