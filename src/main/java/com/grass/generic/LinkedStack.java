package com.grass.generic;

/**
 * Created by grass on 16/6/25.
 */

public class LinkedStack<T> {

    private Node<T> mTop = new Node<T>();

    public void push(T elem) {
        mTop = new Node<T>(mTop, elem);
    }

    public T pop() {
        T result = mTop.content;
        if (!mTop.end()) {
            mTop = mTop.next;
        }
        return result;
    }

    private static class Node<T> {
        private T content;
        private Node<T> next;

        public Node() {

        }

        public Node(Node<T> next, T content) {
            this.next = next;
            this.content = content;
        }

        boolean end() {
            return content == null && next == null;
        }
    }

    public static class Node2<T> {
        private T content;
        private Node2<T> next;

        public Node2() {

        }

        public Node2(Node2<T> next, T content) {
            this.next = next;
            this.content = content;
        }

        boolean end() {
            return content == null && next == null;
        }
    }

    public static void main(String[] args) {
        Node<String> stringNode = new Node<String>();
        Node<Integer> integerNode = new Node<Integer>();
    }
}
