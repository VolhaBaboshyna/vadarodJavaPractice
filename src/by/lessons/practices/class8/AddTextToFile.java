package by.lessons.practices.class8;

import java.io.File;
import java.io.FileWriter;

public class AddTextToFile {


    public static void addTextToFileotn(String text) {
        File file = new File("D:/Оля/java", "class8.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    public static void addTextToFileoabs(String text) {
        File file = new File("src/by/lessons/practices/class8/text", "class8.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }
}
