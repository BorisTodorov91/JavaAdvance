package Lab.StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "src/Lab/StreamsFilesAndDirectories/resourse/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        int bytes = inputStream.read();

        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');

        while (bytes != -1) {

            char symbol = (char) bytes;

            boolean isPunctuation = punctuationTable.contains(symbol);

            if (!isPunctuation) {
                outputStream.write(bytes);
            }

            bytes = inputStream.read();
        }

    }
}
