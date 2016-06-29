package com.grass.generic;

/**
 * Created by grass on 16/6/25.
 */
public class Person<T> {
    public String mName;
    public int mAge;
    public T mOther;
    public Person<T> mMother;

    public Person(String name, int age, Person<T> mother, T other) {
        mName = name;
        mAge = age;
        mMother = mother;
        mOther = other;
    }

    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("grass", 28, null, "");
        Person<Integer> intPerson = new Person<Integer>("honey", 27, null, 18);

        Person noPerson = new Person("", 1, null, null);

        stringPerson = noPerson;
        noPerson = intPerson;
    }
}
