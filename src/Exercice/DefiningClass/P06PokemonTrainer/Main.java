package Exercice.DefiningClass.P06PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        Map<String, Trainer> competitor = new LinkedHashMap<>();
        while (!inputData.equals("Tournament")) {
            String[] command = inputData.split("\\s+");
            String trainerName = command[0];
            String pokemonName = command[1];
            String pokemonElement = command[2];
            int pokemonHealthy = Integer.parseInt(command[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealthy);
            Trainer trainer = null;
            if (competitor.containsKey(trainerName)) {
                trainer = competitor.get(trainerName);
            } else {
                trainer = new Trainer(trainerName);
                competitor.put(trainerName, trainer);
            }
            trainer.getPokemons().add(pokemon);
            inputData = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")) {
            for (Map.Entry<String, Trainer> entry : competitor.entrySet()) {
                entry.getValue().checkElement(entry.getValue().getPokemons(), element);
            }

            element = scanner.nextLine();
        }
        competitor
                .entrySet()
                .stream()
                .sorted((first, second) -> second.getValue().getTrainerNumOfBadges() - first.getValue().getTrainerNumOfBadges())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getTrainerNumOfBadges() + " " + e.getValue().getPokemons().size()));
    }
}
