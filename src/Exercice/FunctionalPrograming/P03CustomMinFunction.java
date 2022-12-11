package Exercice.FunctionalPrograming;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> integerFunction = p-> {
            int min = Integer.MAX_VALUE;
            for (int n : num) {

                if (n < min ){
                    min = n;
                }
            }
            return min;
        };

        System.out.println(integerFunction.apply(num));


    }
}
