package Exercice.Generics.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<String> stringBox = new Box<>();

        for (int i = 0; i < n; i++) {
            String commnd = scanner.nextLine();
            stringBox.add(commnd);
        }
//        String[] command = scanner.nextLine().split(" ");
//
//        int firstIndex = Integer.parseInt(command[0]);
//        int secondIndex = Integer.parseInt(command[1]);
//
//        stringBox.swap(firstIndex, secondIndex);

        String elementForCompare = scanner.nextLine();
        System.out.println(stringBox.countOfGreaterItem(elementForCompare));
    }
}
