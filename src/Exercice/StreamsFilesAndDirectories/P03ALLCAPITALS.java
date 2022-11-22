package Exercice.StreamsFilesAndDirectories;

import java.io.*;

public class P03ALLCAPITALS {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("src/Exercice/StreamsFilesAndDirectories/resources/input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("src/Exercice/StreamsFilesAndDirectories/resources/output.txt"));

        br.lines().forEach(line -> pw.println(line.toUpperCase()));

        br.close();
        pw.close();

    }
}
