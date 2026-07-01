package by.lessons.practices.class9;

import java.util.List;

public class AvgNumberRunnable implements Runnable {
    List<Integer> numbers;

    public AvgNumberRunnable(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void avgNumberCalc1() {
        int sum = 0;
        if (!numbers.isEmpty()) {
            for (Integer num : this.numbers) {
                sum += num;
            }
        } else {
            System.out.println("The list is empty");
        }
        double result = (double) sum / numbers.size();
        System.out.println(result);
    }

    @Override
    public void run() {
        avgNumberCalc1();
    }
}
