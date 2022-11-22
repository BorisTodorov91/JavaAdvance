package Exercice.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01SumLines {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/input.txt"));


        String line = bufferedReader.readLine();

        while (line != null) {

            long sum = 0;
            char[] characterFromLine = line.toCharArray();


            for (char character : characterFromLine) {
                sum += character;
            }

            System.out.println(sum);
            line = bufferedReader.readLine();
        }


    }
}
