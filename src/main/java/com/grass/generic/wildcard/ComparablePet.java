package com.grass.generic.wildcard;

import com.sun.source.tree.CompoundAssignmentTree;

/**
 * Created by grass on 16/7/2.
 * 基类劫持
 */
public class ComparablePet implements Comparable<ComparablePet> {

    public int compareTo(ComparablePet o) {
        return 0;
    }
}

/**
 * 基类劫持
 */
//class Cat extends ComparablePet implements Comparable<Cat>{
//
//}
