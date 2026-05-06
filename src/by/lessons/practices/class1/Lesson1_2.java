package by.lessons.practices.class1;

import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args) {
        /*  System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        int c;
        if (a > b) {
            c = a - b;
            System.out.println("a > b. Результат = " + c);
        } else if (a == b) {
            c = a + b;
            System.out.println("a == b Результат = " + c);
        } else {
            c = b - a;
            System.out.println("a < b Результат = " + c);
        }
         */
        /*
        System.out.println("Task 3");
        System.out.println("Введите a");
        int a = sc.nextInt();1111
        if (a%3==0) {
            System.out.println("Число a делится на 3 без остатка");
        } else {
            System.out.println("Число a не делится на 3 без остатка");
        }
*/

        System.out.println("Task 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите e");
        int e = sc.nextInt();
        if (e%3==0 && e%7==0) {
            System.out.println("Число e делится на 3 и на 7 без остатка");
        }
        else if (e%3==0) {
            System.out.println("Число e делится на 3 остатка");
        }
        else if (e%7==0)
        {
            System.out.println("Число e делится на 7 остатка");
        }

    }
}
