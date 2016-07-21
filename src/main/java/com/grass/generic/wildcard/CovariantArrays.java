package com.grass.generic.wildcard;

/**
 * Created by grass on 16/7/2.
 * 协变
 */

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();

        try {
            fruit[2] = new Fruit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fruit[3] = new Orange();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
