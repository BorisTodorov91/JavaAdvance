package Exercice.Generics.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private final List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(list, firstIndex, secondIndex);
    }

    public int countGrater(T element) {
        return (int) list.stream().filter(elementFromList -> elementFromList.compareTo(element) > 0).count();
    }

    public T max() {
        return list.stream().max(Comparable::compareTo).get();
    }

    public T min() {
        return list.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
