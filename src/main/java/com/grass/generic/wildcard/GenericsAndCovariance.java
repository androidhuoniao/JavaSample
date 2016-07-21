package com.grass.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grass on 16/7/2.
 * List<? extends Fruit> list 可以合法的指向任何一个List<Orange>,一旦执行了这种向上转型,你就会丢掉向其中传递任何对象的能力
 * ,甚至传递Object都不行,但是如果你调用一个返回Fruit的方法,则是安全的
 *
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> list = new ArrayList<Apple>();
        // compile error, can not add any type of object
        //        list.add(new Apple());
        //        list.add(new Fruit());
        //        list.add(new Orange());

        Fruit fruit = list.get(0);
    }
}
