package Exercice.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P3MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfComand = Integer.parseInt(scanner.nextLine());

        Deque<Integer> steck = new ArrayDeque<>();
        for (int i = 0; i < numOfComand; i++) {
            String[] comand = scanner.nextLine().split(" ");
            switch (comand[0]){

                case "1":
                    steck.push(Integer.parseInt(comand[1]));
                    break;
                case "2":
                    steck.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(steck));
                    break;
            }

        }
    }
}
