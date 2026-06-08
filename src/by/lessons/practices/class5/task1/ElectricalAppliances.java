package by.lessons.practices.class5.task1;

public interface ElectricalAppliances {
    default void work() {
    }

    default void start() {
        System.out.println("Электроприбор стартует");
    }

}
