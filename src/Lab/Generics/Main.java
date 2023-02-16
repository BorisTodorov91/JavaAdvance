package Lab.Generics;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Jar
        Jar<Integer> integerJar = new Jar<>();

        integerJar.add(1233);
        integerJar.add(23333);
        System.out.println(integerJar.remove());

        // 2.ArrayCreator
        Integer[] integers = ArrayCreator.create(5, 12);

        for (Integer integer : integers) {
            System.out.print(integer + " ");

        }
        System.out.println();

        // 3.Scale
        Scale<Integer> integerScale = new Scale<>(12, 233);

        System.out.println(integerScale.getHeavier());

        Scale<String> stringScale = new Scale<>("Boris", "Teodora");
        System.out.println(stringScale.getHeavier());
        // 4.UtilitiList

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        int max = ListUtils.getMax(integerList);
        System.out.println(max);

        int min = ListUtils.getMin(integerList);
        System.out.println(min);
    }
}
