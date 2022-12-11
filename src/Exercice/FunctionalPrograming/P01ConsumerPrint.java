package Exercice.FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Arrays.stream(scanner.nextLine().split("\\s+"))
        //       .forEach(System.out::println);


        List<String> name = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());


        Consumer<String> consumer = System.out::println;

        //name.forEach(consumer);

        //name.forEach(consumer::accept);

        for (String s : name) {
            consumer.accept(s);
        }
    }
}
