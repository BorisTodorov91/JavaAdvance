package Exercice.FunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();

        Arrays.stream(input).mapToInt(Integer::parseInt).forEach(list::add);


        list.stream().filter(w -> w % 2 == 0).forEach(System.out::println);


    }
}
