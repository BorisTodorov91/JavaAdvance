package Exercice.FunctionalPrograming;

import java.util.Scanner;
import java.util.function.*;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Функционални интерфейси

        // Function <приема ,върща>
        Function<String, Integer> parseInt = Integer::parseInt;

        // UnaryOperator<приема и върща> този тип данни който сме подали върща като стойност
        UnaryOperator<String> stringUnaryOperator = s -> "Hallo " + s;

        // Predicate<приема> и винаги върща booleоn стойност
        Predicate<String> s = p -> p.length() > 5;

        //Consumer<приема> но не върща нищо
        Consumer<String> consumer = System.out::println;

        Supplier<String> stringSupplier = () -> "Peso";

        //int sum = Arrays.stream(scanner.nextLine().split("")).mapToInt(p -> Integer.parseInt(p)).sum();

    }
}
