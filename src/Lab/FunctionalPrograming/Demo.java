package Lab.FunctionalPrograming;

import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> number = List.of(13, 12, 42, 69, 73);

        number.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}
