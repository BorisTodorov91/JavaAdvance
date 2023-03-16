/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int element) {
        //1. Create newNode
        Node newNode = new Node(element);
        //2. head = newNode
        if (!isEmpty()) {
            newNode.next = head;
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        //3. size++
        size++;
    }

    public void addLast(int element) {

        if (isEmpty()) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove from empty list!");
        }
        int result = head.value;

        size--;
        head = head.next;
        if (this.size > 1) {
            head.prev = null;
        }
        if (isEmpty()) {
            head = null;
            tail = null;

        }
        return result;

    }

    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        int result = tail.value;

        tail = tail.prev;
        tail.next = null;
        this.size--;
        return result;


    }

    public int get(int searchIndex) {
        checkIndex(searchIndex);

        int currentIndex = 0;
        Node currentNode;
        if (searchIndex > size / 2) {
            currentNode = tail;
            int lastIndex = size - 1;
            int countOfIteration = lastIndex - searchIndex;
            for (int i = 0; i < countOfIteration; i++) {
                currentNode = currentNode.prev;
            }
        } else {

            currentNode = head;
            while (currentIndex < searchIndex) {
                currentNode = currentNode.next;
                currentIndex++;
            }

        }

        return currentNode.value;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = head;

        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public int[] toArr() {
        List<Integer> result = new ArrayList<>();
        forEach(result::add);

        return result.stream().mapToInt(e -> e).toArray();
    }

    private void checkIndex(int searchIndex) {
        if (searchIndex < 0 || searchIndex >= size) {
            throw new IndexOutOfBoundsException("No such index int the list!");
        }
    }

    private boolean isEmpty() {
        return this.size == 0;
    }
}
