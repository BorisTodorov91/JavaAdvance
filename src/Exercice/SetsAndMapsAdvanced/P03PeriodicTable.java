package Exercice.SetsAndMapsAdvanced;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfElements = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < numberOfElements; i++) {
            String[] compound = scanner.nextLine().split("\\s+");

            Collections.addAll(elements, compound);

        }

        String result = String.join(" ", elements);
        System.out.println(result);

    }
}
