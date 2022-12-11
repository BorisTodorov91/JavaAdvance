package Exercice.FunctionalPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class P06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Arrays.stream(scanner.nextLine().split("\\s+")).filter(e -> e.length() <= n).forEach(System.out::println);

    }
}
