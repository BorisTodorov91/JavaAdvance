package Lab.SetsAndMapsAdvanced;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> countinets = new LinkedHashMap();

        while (n-- > 0) {

            String[] info = scanner.nextLine().split("\\s+");

            String continent = info[0];
            String county = info[1];
            String city = info[2];


            countinets.putIfAbsent(continent, new LinkedHashMap<>());

            Map<String, List<String>> countries = countinets.get(continent);

            countries.putIfAbsent(county, new ArrayList<>());

            List<String> cities = countries.get(county);

            cities.add(city);

        }

        countinets.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((key1, value1) -> {
                String cities = String.join(", ", value1);
                System.out.println(" " + key1 + " -> " + cities);
            });
        });


    }
}
