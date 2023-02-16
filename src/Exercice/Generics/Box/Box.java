package Exercice.Generics.Box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private final List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        // Collections.swap(list, firstIndex, secondIndex);
        // как можем да разменим местата на две променливи без да използваме 3-та помоща променлива за Intiger  ?
        // а = 5
        // б = 10
        // а = 10
        // б = 5
        //  а = а+б-а = 15 - 5 = 10
        //  б = а-б = 10 - 5 = 5
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }

    public int countOfGreaterItem(T elementToCompere) {

        return (int) list.stream()
                .filter(elementFromBox -> elementFromBox.compareTo(elementToCompere) > 0)
                .count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : list) {
            sb.append(String.format("%s: %s%n", t.getClass().getName(), t));
        }

        return sb.toString();
    }
}
