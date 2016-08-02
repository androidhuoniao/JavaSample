package com.grass.kotlin

/**
 * Created by grass on 16/7/24.
 */

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6, 7)
    val list3 = emptyList<Int>()

    val listall = listOf(list1, list2, list3)
    listall.forEach { println(it) }

    if (listall.all { it.isEmpty() }) {
        println("list is empty");
    } else {

    }

    if (listOf(list3).all { it.isEmpty() }) {
        println("list3 is empty");
    } else {

    }
}
