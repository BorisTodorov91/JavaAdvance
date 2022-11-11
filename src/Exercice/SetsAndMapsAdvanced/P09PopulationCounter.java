package Exercice.SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P09PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Long>> countryInfo = new TreeMap<>();
        Integer total = 0;
        while (!"report".equals(input)) {
            //Sofia|Bulgaria|1
            String[] inputParts = input.split("\\|");

            String city = inputParts[0];
            String country = inputParts[1];
            Long population = Long.parseLong(inputParts[2]);

            countryInfo.putIfAbsent(country, new LinkedHashMap<>());
            countryInfo.get(country).put(city, population);
            input = scanner.nextLine();
        }

        countryInfo.entrySet().stream().sorted((e1, e2) -> getTotoalPopulation(e2.getValue()).compareTo(getTotoalPopulation(e1.getValue())))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)%n", entry.getKey(), getTotoalPopulation(entry.getValue()));
                    entry.getValue().entrySet().stream()
                            .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });

        System.out.println();

    }

    private static Long getTotoalPopulation(Map<String, Long> cityPopulation) {
        return cityPopulation.values().stream().reduce(Long::sum).orElse(0L);
    }
}
