package com.grass.generic.wildcard;

/**
 * Created by grass on 16/7/2.
 */
public class NoCovariantGenerics {
    /**
     * 为什么不行?
     * 主要是因为泛型仅在编译的时候有效,运行时,代码中擦除了所有的泛型的信息,一个List必须具备一个泛型,并且不能够向上转型,
     * 下面的代码左边表示可以存储Fruit和Fruit的子类,右边表示存储Apple和Apple的子类,虽然Apple是Fruit的子类,但是Fruit的子类可以有很多
     * 泛型中不存在內建的协变类型
     */
    //    List<Fruit> list = new ArrayList<Apple>();
}
