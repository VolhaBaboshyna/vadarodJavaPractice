package by.lessons.practices.class8;

import java.io.Externalizable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static by.lessons.practices.class8.AddTextToFile.addTextToFileoabs;
import static by.lessons.practices.class8.AddTextToFile.addTextToFileotn;
import static by.lessons.practices.class8.Farm.deserialize;
import static by.lessons.practices.class8.Farm.serialize;
import static by.lessons.practices.class8.ReadTextFromFile.readTextFromFile;

public class Main {

    public static void main(String[] args) {
        String txt = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.";
        addTextToFileotn(txt);
        addTextToFileoabs(txt);

        String path1 = "src\\by\\lessons\\practices\\class8\\text\\class8.txt";
        String path2 = "D:\\Оля\\java\\class8.txt";

//        System.out.println(readTextFromFile(path1));
//        System.out.println(readTextFromFile(path2));

        Farm farm1 = new Farm("Корова", "Зорька");
        Farm farm2 = new Farm("Бычок", "Вовка");
        List<Farm> farms = new ArrayList<>();
        farms.add(farm1);
        farms.add(farm2);



        serialize(farms, new File("src/by/lessons/practices/class8/text/class8-1.txt"));
        String path3 = "src/by/lessons/practices/class8/text/class8-1.txt";
        List<Farm> farms1= deserialize(path3);
        System.out.println(farms1);
    }
}
