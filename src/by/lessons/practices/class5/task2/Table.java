package by.lessons.practices.class5.task2;

public class Table<I, C extends Man> {
    private I invNumber;
    private C character;

    public Table(I invNumber) {
        this.invNumber = invNumber;
    }

    public Table(I invNumber, C character) {
        this.invNumber = invNumber;
        this.character = character;
    }

    public String toString() {
        String result = "Инвентарный номер стола: " + invNumber + ", За ним сидит: " + character;
        return result;
    }

    public String getNameOfPerson () {
        String name = character.getName();
        return name;
    }
}
