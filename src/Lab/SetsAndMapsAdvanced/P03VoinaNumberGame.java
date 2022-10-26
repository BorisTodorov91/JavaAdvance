package Lab.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashSet<Integer> firtDeck = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0) {


            int firstCards = firtDeck.iterator().next();
            firtDeck.remove(firstCards);

            int secondCard = secondDeck.iterator().next();
            secondDeck.remove(secondCard);

            if (firstCards > secondCard) {
                firtDeck.add(firstCards);
                firtDeck.add(secondCard);
            } else if (secondCard > firstCards) {
                secondDeck.add(firstCards);
                secondDeck.add(secondCard);
            }


            if (firtDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }
        }


        if (firtDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (secondDeck.size() > firtDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }
}
