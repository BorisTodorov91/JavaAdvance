package Exercice.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/input.txt"));

        String line = bufferedReader.readLine();
        long sum = 0;

        while (line != null) {

            char[] characterFromLine = line.toCharArray();


            for (char character : characterFromLine) {
                sum += character;
            }

            line = bufferedReader.readLine();
        }
        System.out.println(sum);

    }
}
