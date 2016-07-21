package com.grass.generic;

/**
 * Created by grass on 16/6/30.
 * 为什么书上说这里有冗余呢?
 * 这是因为从Colored,到ColoredDimension,再到Solid中包含很多重复函数,没有使用到继承
 */

public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
        solid.getItem();
        solid.getX();
        solid.color();
    }
}
