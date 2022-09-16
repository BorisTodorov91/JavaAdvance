package Exercice.StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int countToPush = Integer.parseInt(numbers[0]);
        int countToPop = Integer.parseInt(numbers[1]);
        int countToSearch = Integer.parseInt(numbers[2]);

        String[] element = scanner.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countToPush; i++) {
            stack.push(Integer.parseInt(element[i]));
        }

        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println("0");
        } else if(stack.contains(countToSearch)){
            System.out.println(true);
        }else {
            int minElement = Collections.min(stack);
            System.out.println(minElement);
        }

    }
}
