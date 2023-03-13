package workshop.smartArray;

import java.util.function.Consumer;

public class SmartArray {

    private int[] data;
    private int size;


    public SmartArray() {
        this.size = 0;
        this.data = new int[2];
    }

    private int[] grow() {

        int newLength = data.length * 2;   //O(log n)
        //int newLength = data.length + 1; // O (log n * n)

        int[] newData = new int[newLength];

        System.arraycopy(data, 0, newData, 0, data.length); // native method - изпълнява се на по ниско ниво

        return newData;
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
    }

    public void add(int element) {
        if (size == data.length) {
            data = grow();
        }
        data[size++] = element;
    }

    public int get(int index) {
        ensureIndex(index);
        return data[index];
    }

    public int size() {
        return size;
    }

    public int remove(int index) {
        int removedElement = get(index);

        if (size - 1 - index >= 0) {
            System.arraycopy(data, index + 1, data, index, size - 1 - index);
        }
        data[size - 1] = 0;

        size--;
        return removedElement;

    }

    public boolean contain(int element) {

        for (int i = 0; i < size; i++) {
            int next = data[i];
            if (element == next) {
                return true;
            }
        }
        return false;
    }

    public void add(int index, int element) {

        int lasElement = data[size - 1];

        /*
        for (int i = size - 1; i > index ; i--) {
            data[i] = data[i - 1];
        }
        */

        if (size - 1 - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - 1 - index);
        }

        data[index] = element;
        add(lasElement);
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(data[i]);
        }
    }
}
