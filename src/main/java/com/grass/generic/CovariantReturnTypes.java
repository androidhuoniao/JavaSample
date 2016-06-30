package com.grass.generic;

/**
 * Created by baidu on 16/6/30.
 */
public class CovariantReturnTypes {

    class Base {

    }

    class Derived extends Base {

    }

    interface OridinaryGetter {
        Base get();
    }

    interface DerivedGetter extends OridinaryGetter {
        Derived get();
    }

    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }

}
