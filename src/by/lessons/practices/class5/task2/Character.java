package by.lessons.practices.class5.task2;

public class Character implements Man{
    private String name;
    private String surname;

    public Character(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        String result = "Имя: " + name + " Фамилия: " + surname;
        return result;
    }
}
