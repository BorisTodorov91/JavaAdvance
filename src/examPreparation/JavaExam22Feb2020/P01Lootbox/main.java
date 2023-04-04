/*
 * Copyright (c) 2023 Boris T.
 */

package examPreparation.JavaExam22Feb2020.P01Lootbox;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();
        int loot = 0;


        String input = scanner.nextLine();

        Arrays.stream(input.split("\\s+")).map(Integer::parseInt).forEach(first::offer);

        input = scanner.nextLine();
        Arrays.stream(input.split("\\s+")).map(Integer::parseInt).forEach(second::push);


        while (!first.isEmpty() && !second.isEmpty()) {

            int firstBoxItem = first.peek();
            int secondBoxItem = second.poll();

            int sum = firstBoxItem + secondBoxItem;

            if (sum % 2 == 0) {
                first.poll();
                loot += sum;
            } else {
                first.offer(secondBoxItem);
            }

        }

        if (first.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (loot >= 100) {
            System.out.printf("Your loot was epic! Value: %d", loot);
        } else {
            System.out.printf("Your loot was poor... Value: %d", loot);
        }
    }


}
