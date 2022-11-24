package Lab.SetsAndMapsAdvanced.fun;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfLine = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> data = new LinkedHashMap<>();
        for (int i = 0; i < numOfLine; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!data.containsKey(word)) {
                data.put(word, new ArrayList<>());

            }
            data.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> stringListEntry : data.entrySet()) {
            System.out.printf("%s - %s%n", stringListEntry.getKey(), String.join(", ", stringListEntry.getValue()));
        }


    }
}
