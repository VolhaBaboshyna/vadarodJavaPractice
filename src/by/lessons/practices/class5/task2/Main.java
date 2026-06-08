package by.lessons.practices.class5.task2;

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("Иван", "Иванов");
        Table<Integer, Character> table1 = new Table<>(1, character1);
        Student student1 = new Student("Экономический");
        System.out.println(table1.getNameOfPerson());
//        Table<Integer, Student> table2 = new Table<>(2, student1);
//        Employee employee1 = new Employee("10000");
//        Table<Integer, Employee> table3 = new Table<>(3, employee1);
//        System.out.println(table1.toString());

    }
}
