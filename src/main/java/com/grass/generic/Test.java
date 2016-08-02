package com.grass.generic;

/**
 * Created by baidu on 16/8/2.
 * 一个测试例子,用来验证基本类型的自动装箱有时候是不起作用的
 */
public class Test {
    public static void main(String[] args) {
        // FillArray.fill(new int[5], new MyGenerator());//error
//        FillArray.fill(new Integer[5], new MyGenerator());
    }

}

interface ITestGenerator<T> {
    T next();
}

class MyGenerator implements ITestGenerator<Integer> {
    public Integer next() {
        return 0;
    }
}

class FillArray<T> {
    public static <T> void fill(T[] arr, Generator<T> generator) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.next();
        }
    }
}
