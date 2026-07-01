package by.lessons.practices.class9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 4, 2, 9);
        List<Integer> list2 = List.of(1, 44, 21, 23, 1);
        List<Integer> list3 = List.of(4, 5, 3, 20, 54);
        List<Integer> list4 = List.of(7, 77, 2, 18, 4);
        List<Integer> list5 = List.of(11, 83, 77, 51, 5);

        AvgNumber avgNumbers1 = new AvgNumber(list1);
        avgNumbers1.setName("Potok1");
        AvgNumber avgNumbers2 = new AvgNumber(list2);
        avgNumbers2.setName("Potok2");
        AvgNumber avgNumbers3 = new AvgNumber(list3);
        avgNumbers3.setName("Potok3");
        AvgNumber avgNumbers4 = new AvgNumber(list4);
        avgNumbers4.setName("Potok4");
        AvgNumber avgNumbers5 = new AvgNumber(list5);
        avgNumbers5.setName("Potok5");

        avgNumbers1.start();
        avgNumbers2.start();
        avgNumbers3.start();
        avgNumbers4.start();
        avgNumbers5.start();

        AvgNumberRunnable avgNumberRunnable1 = new AvgNumberRunnable(list1);
        Thread threadList1 = new Thread(avgNumberRunnable1);
        threadList1.start();
    }

}
