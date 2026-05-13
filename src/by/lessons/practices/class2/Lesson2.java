package by.lessons.practices.class2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //  task 1
//        int a=7;
//        while (a<=98) {
//            System.out.print(a + " ");
//            a+=7;
//        }
//    }

        //  task 2
//        int a = 1, i = 0, sum = 0;
//        while (i < 10) {
//            sum = sum + a++;
//            i++;
//        }
//        System.out.print("Сумма: " + sum);
//    }

        //  task 3
//        for (int a = 100; a >= 1; a--) {
//            if (a > 1) {
//                System.out.print(a + ",");
//            } else {
//                System.out.print(a);
//            }
//        }
        // task 3.1
//        for (int a = 1; a <= 100; a++) {
//        if (a % 10 == 0) {
//            System.out.print(a + " ");
//        }
//        }

        //  task 4
//        for (int a = 1; a <= 100; a++) {
//            if (a % 2 == 0) {
//                System.out.print(a + " ");
//            }
//        }

        //task 5
//        int[] array = new int[100];
//        int length = array.length;
//        for (int i = 0; i<array.length; i++) {
//            array[i]=i+1;
//        }
//        for (int j=0; j<array.length; j++) {
//            System.out.print(array[j] + " ");
//        }

        //  task 6
//        int[] array = {1, 3, 9, 6, 2, 6};
//        int i, max = array[0], min = array[0];
//        for (i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        System.out.println(min + " min");
//        System.out.print(max + " max");

        //  task 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое не заканчивается на 0");
        int a = sc.nextInt();
        int b=a % 10, min=b, max=b;
        if (a%10!=0) {
            while (a != 0) {
                b = a % 10;
                if (max < b) {
                    max = b;
                }
                if (min > b) {
                    min = b;
                }
                a = a / 10;
            }
        }  else {
            System.out.println("Вы ввели число, которое заканчиватеся на 0");
        }
        System.out.println(min + " min");
        System.out.print(max + " max");

        //  task7
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число, которое не заканчивается на 0");
//        int a = sc.nextInt();
//        int sum=0, b, i=0;
//        double avg;
//        if (a%10!=0) {
//            while (a != 0) {
//                b = a % 10;
//                sum = sum + b;
//                ++i;
//                a = a / 10;
//            }
//        }  else {
//            System.out.println("Вы ввели число, которое заканчиватеся на 0");
//        }
//        avg = (double) sum /i;
//        System.out.println("Среднее число: " + avg);

    }
}
