
/*
 * Copyright (c) 2023 Boris T.
 */


/**
 * Custom implementation of LIFO data structure
 * w
 */
package workshop.CustumStack;

import java.util.function.Consumer;

public class CustomStack {

    private Node top;
    private int size;

    public void push(int element) {
        Node newNode = new Node(element, this.top);
        newNode.prev = top;
        this.top = newNode;
        size++;
    }

    public int pop() {
        ensureNotEmpty();

        int value = top.element;
        top = top.prev;
        size--;
        return value;
    }

    public int peek() {

        ensureNotEmpty();
        return top.element;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = top;
        while (current != null) {
            consumer.accept(current.element);
            current = current.prev;
        }
    }

    private void ensureNotEmpty() {
        if (top == null) {
            throw new IllegalArgumentException("Stack is empty!");
        }
    }

    private static class Node {
        private final int element;
        private Node prev;

        private Node(int element, Node prev) {
            this.element = element;
            this.prev = prev;
        }
    }
}
