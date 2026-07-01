package by.lessons.practices.class9;

import java.util.List;

public class AvgNumber extends Thread {
    List<Integer> numbers;

    public AvgNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void avgNumberCalc() throws InterruptedException {
        int sum = 0;
        String str = Thread.currentThread().getName();
        System.out.println("Поток " + str + " стартовал");
        if (!numbers.isEmpty()) {
            for (Integer num : this.numbers) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Поток " + str + " работает");

                } catch (Exception e) {
                    throw new RuntimeException("Error");

                }
                sum += num;
            }
        } else {
            System.out.println("The list is empty");
        }
        double result = (double) sum / numbers.size();
        System.out.println("Поток " + str + " закончил работу с результатом: " + result);
    }

    @Override
    public void run() {
        try {
            avgNumberCalc();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
