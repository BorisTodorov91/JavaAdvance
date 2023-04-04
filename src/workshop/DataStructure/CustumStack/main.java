/*
 * Copyright (c) 2023 Boris T.
 */

package workshop.DataStructure.CustumStack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomStack customStack = new CustomStack();
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.push(6);
        customStack.push(7);

        customStack.forEach(System.out::println);

        System.out.println();
    }
}
