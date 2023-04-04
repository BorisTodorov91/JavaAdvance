/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.DataStructure.LinkedList;

import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private int size;

    public void addFirst(int element) {
        //1. Create newNode
        Node newNode = new Node(element);
        //2. head = newNode
        if (!isEmpty()) {
            newNode.next = head;
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
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;

    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove from empty list!");
        }
        int result = head.value;

        head = head.next;
        size--;
        return result;

    }

    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;// стигаме до предпоследния ноде
        }
        int result = currentNode.next.value; // взимаме стойноста на последноя ноде
        currentNode.next = null;
        size--;

        return result; // върщаме стойноста на премахнатияноде


    }

    public int get(int searchIndex) {
        checkIndex(searchIndex);

        int currentIndex = 0;
        Node currentNode = head;

        while (currentIndex < searchIndex) {
            currentNode = currentNode.next;
            currentIndex++;
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
        int[] array = new int[size];

        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            array[count] = currentNode.value;
            count++;
            currentNode = currentNode.next;
        }

        return array;
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
