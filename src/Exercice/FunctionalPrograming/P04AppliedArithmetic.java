package Exercice.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> number = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        UnaryOperator<List<Integer>> add = numbers -> numbers.stream().map(p -> p + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> sub = numbers -> numbers.stream().map(p -> p - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> mul = numbers -> numbers.stream().map(p -> p * 2).collect(Collectors.toList());

        Consumer<List<Integer>> printer = numbes -> numbes.forEach(n -> System.out.print(n + " "));


        String command = scanner.nextLine();


        while (!"end".equals(command)) {
            switch (command) {
                case "add" -> number = add.apply(number);
                case "subtract" -> number = sub.apply(number);
                case "multiply" -> number = mul.apply(number);
                case "print" -> {
                    printer.accept(number);
                    System.out.println();
                }
                default -> throw new IllegalStateException("Unexpected value: " + command);
            }

            command = scanner.nextLine();
        }

    }
}
