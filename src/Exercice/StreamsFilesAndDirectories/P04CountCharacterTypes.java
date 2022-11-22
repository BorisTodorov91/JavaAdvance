package Exercice.StreamsFilesAndDirectories;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {


        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        FileReader fr = new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/input.txt");
        PrintWriter printWriter = new PrintWriter(new FileWriter("src/Exercice/StreamsFilesAndDirectories/resources/output.txt"));

        int oneByte = fr.read();
        while (oneByte >= 0) {
            char symbol = (char) oneByte;

            if (isVowel(symbol)) {
                vowels++;
            } else if (isPunctuate(symbol)) {
                punctuation++;
            } else if (!Character.isWhitespace(symbol)) {
                consonants++;
            }

            oneByte = fr.read();
        }
        //Vowels: 41
        //Other symbols: 72
        //Punctuation: 6
        fr.close();
        printWriter.printf("Vowels: %d%n", vowels);
        printWriter.printf("Other symbols: %d%n", consonants);
        printWriter.printf("Punctuation: %d%n", punctuation);
        printWriter.close();

    }

    private static boolean isPunctuate(char symbol) {

        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }


    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'e' || symbol == 'i';
    }
}
