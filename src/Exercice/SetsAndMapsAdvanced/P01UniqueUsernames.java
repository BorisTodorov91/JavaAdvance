package Exercice.SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfName = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> names = new LinkedHashSet<>();
        for (int i = 0; i < numberOfName; i++) {
            String name = scanner.next();
            names.add(name);
        }
        for (String name : names) {
            System.out.println(name);
        }

    }
}
