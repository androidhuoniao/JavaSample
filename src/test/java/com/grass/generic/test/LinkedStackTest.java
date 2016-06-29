package com.grass.generic.test;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import com.grass.generic.LinkedStack;

/**
 * Created by grass on 16/6/25.
 */
public class LinkedStackTest {

    @Test
    public void testLinkedStack() {
        LinkedStack<String> stack = new LinkedStack<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        Assert.assertThat(stack.pop(), Is.is("3"));
        Assert.assertThat(stack.pop(), Is.is("2"));
        Assert.assertThat(stack.pop(), Is.is("1"));

    }
}
