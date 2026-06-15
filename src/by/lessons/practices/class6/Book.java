package by.lessons.practices.class6;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    List<Page> pages;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
        //        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Книга: [Автор: " + author + ", Название книги: " + title + "]";
    }

    public void deletePage(int pageNumber) {
        pages.remove(pageNumber - 1);
    }

    public int pagesCount() {
        return pages.size();
    }
}
