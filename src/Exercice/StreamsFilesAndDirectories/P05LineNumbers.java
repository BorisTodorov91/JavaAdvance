package Exercice.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("src/Exercice/StreamsFilesAndDirectories/resources/outputPrintLine.txt");
        String readLine = bufferedReader.readLine();

        int count = 1;
        while (readLine != null) {

            printWriter.println(count++ + ". " + readLine);
            readLine = bufferedReader.readLine();
        }
        printWriter.close();
        bufferedReader.close();


    }
}
