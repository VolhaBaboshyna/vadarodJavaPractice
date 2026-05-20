package by.lessons.practices.class3;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book();
//        Book book1 = new Book(1, "Петров", "Сидоров", "Голубая луна", 2020, 129, 23.88);
//        String book1Name = book1.info();
//        System.out.println(book1Name);
//        book1.changePrice(12.2);
//        String bookChangePrice = book1.info();
//        System.out.println(bookChangePrice);

        Book[] books = new Book[5];

        books[0] = new Book(2, "Иванов", "Сидорова", "Голубая луна", 2019, 133, 24.6);
        books[1] = new Book(3, "Петров", "Алексеева", "Тень ветра", 2018, 350, 45.2);
        books[2] = new Book(4, "Соколов", "Михайлов", "Тайны океана", 2017, 280, 32.8);
        books[3] = new Book(5, "Морозов", "Павлова", "Век технологий", 2016, 192, 19.5);
        books[4] = new Book(6, "Волков", "Федорова", "Свет далеких звезд", 2015, 415, 58.0);


        for (Book value : books) {
            String book2Name = value.info();
            System.out.println(book2Name);

        }

    }


}
