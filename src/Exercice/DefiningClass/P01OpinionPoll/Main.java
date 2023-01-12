package Exercice.DefiningClass.P01OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfPeope = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numOfPeope; i++) {

            String[] peorsonData = scanner.nextLine().split("\\s+");
            String firstName = peorsonData[0];
            int age = Integer.parseInt(peorsonData[1]);

            Person person = new Person(firstName, age);

            people.add(person);

        }

        people
                .stream()
                .filter(person -> person.getAge() > 30)
                .sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(System.out::print);

    }
}
