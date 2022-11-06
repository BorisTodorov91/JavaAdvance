package Exercice.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizes = scanner.nextLine().split("\\s+");

        int firstSetSize = Integer.parseInt(sizes[0]);
        int secondSetSize = Integer.parseInt(sizes[1]);

        LinkedHashSet<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            String element = scanner.nextLine();
            firstSet.add(element);
        }

        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < secondSetSize; i++) {
            String element = scanner.nextLine();
            secondSet.add(element);
        }


        firstSet.retainAll(secondSet);
        for (String element : firstSet) {
            System.out.print(element + " ");
        }

    }
}
