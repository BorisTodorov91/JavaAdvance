package Exercice.StreamsFilesAndDirectories;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06WordCount {
    public static void main(String[] args) throws IOException {

        Scanner readFirsFile = new Scanner(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/words.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("src/Exercice/StreamsFilesAndDirectories/resources/result.txt"));

        String[] wordToSearch = readFirsFile.nextLine().split(" ");

        System.out.println();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : wordToSearch) {
            map.put(word, 0);
        }

        Scanner readSecondFile = new Scanner(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/text.txt"));
        String singleWord = readSecondFile.next();
        while (readSecondFile.hasNext()) {

            if (map.containsKey(singleWord)) {
                int occuracne = map.get(singleWord);
                occuracne++;

                map.put(singleWord, occuracne);
            }
            singleWord = readSecondFile.next();
        }

        map.entrySet().stream().forEach(entry -> pw.printf("%s - %d%n", entry.getKey(), entry.getValue()));
        readFirsFile.close();
        readSecondFile.close();
        pw.close();
    }
}
