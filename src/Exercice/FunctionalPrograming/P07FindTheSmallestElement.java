package Exercice.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNum = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> function = list -> {

            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < listOfNum.size(); i++) {

                if (listOfNum.get(i) <= min) {

                    min = listOfNum.get(i);
                    index = i;
                }
            }
            return index;
        };

        System.out.println(function.apply(listOfNum));

    }
}
