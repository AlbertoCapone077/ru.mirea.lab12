package words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordGame {
    public static void main(String[] args) {
        final String FILENAME = "file.txt";

        try {
            String words = new String(Files.readAllBytes(Paths.get(FILENAME)));
        } catch (IOException e) {
            e.printStackTrace();
            String words = "";
        }
    }
}