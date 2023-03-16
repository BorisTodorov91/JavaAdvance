/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.LinkedList;

public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}