package by.lessons.practices.class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {
    public static String readTextFromFile(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
