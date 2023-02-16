package Exercice.Generics;

import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }

    public static <T extends Comparable> T getMin(List<T> list) {
        T min = list.get(0);

        for (T integer : list) {
            if (integer.compareTo(min) > 0) {
                min = integer;
            }
        }
        return min;
    }

}
