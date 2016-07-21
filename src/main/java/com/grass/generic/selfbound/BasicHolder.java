package com.grass.generic.selfbound;

/**
 * Created by grass on 16/7/3.
 */
public class BasicHolder<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    void f() {
        System.out.println(item.getClass().getSimpleName());
    }
}
