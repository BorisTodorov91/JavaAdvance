/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.CustumStack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomStack customStack = new CustomStack();
        customStack.push(12);
        customStack.push(13);
        customStack.push(15);
        customStack.push(11);
        customStack.push(10);
        customStack.push(1);
        customStack.push(12333);

        customStack.forEach(System.out::println);

        System.out.println();
    }
}
