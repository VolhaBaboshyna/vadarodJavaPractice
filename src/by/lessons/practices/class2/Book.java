package by.lessons.practices.class2;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int year;
    int pageCount;
    double price;

    public Book(int id, String name, String author, String publisher, int year, int pageCount, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
    }

    public Book() {
        System.out.println("Конструктор вызвался");
    }


    public String info() {
        String result = "id: " + id + ", name: " + name + ", author: " + author + ", publisher " + publisher +
                ", year" + year + ", pageCount" + pageCount + ", price: " + price;
        return result;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public Book[] removeBook(Book[] books, int id) {
        int i=0;
        if (books[i].id == id) {
            books[i]=null;

        };
        return books;
    }

}
