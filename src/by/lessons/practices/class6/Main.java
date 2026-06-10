package by.lessons.practices.class6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Привет");
        list.add("Как дела");
        list.add("Праздник");
        list.add("Суфле");

        System.out.println(list);

        boolean isKonfeta = list.contains("Конфета");

        int kolichestvo = list.size();

        System.out.println(kolichestvo);

        List<String> pokupki = new ArrayList<String>();

        pokupki.add("Молоко");
        pokupki.add("Сметана");
        pokupki.add("Хлеб");
        pokupki.add("Мыло");
        pokupki.add("Салфетки");

        System.out.println(pokupki);

        pokupki.remove(pokupki.indexOf("Мыло"));

        System.out.println(pokupki);

        Book book = new Book("В. Альтушкин", "На заре моей юности");
        Book book1 = new Book("В. Альтушкин", "На заре моей юности");
        Book book2 = new Book("Л. Тарелочкина", "Книга рецептов");
        Book book3 = new Book("Г. Апполонов", "Тополиный пух");

        List<Book> books = new ArrayList<>(List.of(book1, book2, book3));
        System.out.println(books);

        books.remove(1);

        System.out.println(books);

        Set<Book> books1 = new HashSet<>();

        books1.add(book);
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);

        System.out.println(books1);


        Book book4 = new Book("Г. Апполонов", "Тучи");
        Book book5 = new Book("Г. Апполонов", "Билетик в кино");


    }
}
