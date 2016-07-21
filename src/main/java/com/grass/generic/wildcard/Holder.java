package com.grass.generic.wildcard;

/**
 * Created by grass on 16/7/2.
 */
public class Holder<T> {
    private T value;

    public Holder() {

    }

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> holderApple = new Holder<Apple>(new Apple());

        Apple apple = holderApple.getValue();
        holderApple.setValue(apple);

        //        Holder<Fruit> fruitHolder = value;

        Holder<? extends Fruit> fruitHolder = holderApple;
        Fruit fruit = fruitHolder.getValue();

        apple = (Apple) fruitHolder.getValue();

        Orange orange = (Orange) fruitHolder.getValue();

        //        fruitHolder.setValue(new Apple());
//        fruitHolder.setValue(new Orange());

    }
}

