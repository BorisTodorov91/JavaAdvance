package Exercice.Generics.Tupple;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String firstName = input.split(" ")[0];
        String secodName = input.split(" ")[1];
        Tuple<String, String> stringStringTupple = new Tuple<>(firstName, secodName);

        input = scanner.nextLine();
        String name = input.split(" ")[0];
        Integer beer = Integer.parseInt(input.split(" ")[1]);
        Tuple<String, Integer> secondTupple = new Tuple<>(name, beer);

        input = scanner.nextLine();
        Integer n = Integer.parseInt(input.split(" ")[0]);
        Double m = Double.parseDouble(input.split(" ")[1]);

        Tuple<Integer, Double> doubleTuple = new Tuple<>(n, m);
        System.out.println(stringStringTupple);
        System.out.println(secondTupple);
        System.out.println(doubleTuple);
    }
}
