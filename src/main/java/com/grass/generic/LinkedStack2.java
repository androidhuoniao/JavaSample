package com.grass.generic;

/**
 * Created by grass on 16/6/25.
 */

public class LinkedStack2<T> {

    private Node mTop = new Node();

    public void push(T elem) {
        mTop = new Node(mTop, elem);
    }

    public T pop() {
        T result = mTop.content;
        if (!mTop.end()) {
            mTop = mTop.next;
        }
        return result;
    }

    private class Node {
        private T content;
        private Node next;

        public Node() {

        }

        public Node(Node next, T content) {
            this.next = next;
            this.content = content;
        }

        boolean end() {
            return content == null && next == null;
        }
    }

}
