package by.lessons.practices.class9;

public class MainLambda {
    public static void main(String[] args) {
        Multiple multiple = (a, b) -> {
            return a * b;
        };

        System.out.println(multiple.multiplication(5,10));

    }
}
