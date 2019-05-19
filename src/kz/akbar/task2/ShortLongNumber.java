package kz.akbar.task2;

import java.util.Arrays;
import java.util.logging.Logger;

public class ShortLongNumber {
    private static final Logger LOG = Logger.getLogger(ShortLongNumber.class.getName());

    public int numberCapacity(int number) {
        int capacity = 0;
        do {
            number = number / 10;
            capacity++;
        } while (number > 0);
        return capacity;
    }

    public int[] minMaxCapacityNumber(int... numbers) {
        LOG.info("Getting number with minimum and maximum capacity form: " + Arrays.toString(numbers));
        int[] capacityNumber = new int[4];
        int minCap = numberCapacity(numbers[0]);
        int maxCap = numberCapacity(numbers[0]);
        int curCap = 1;
        int minCapNum = 0;
        int maxCapNum = 0;
        for (int i = 1; i < numbers.length; i++) {
            curCap = numberCapacity(numbers[i]);
            if (curCap < minCap) {
                minCap = curCap;
                minCapNum = numbers[i];
            }
            if (curCap > maxCap) {
                maxCap = curCap;
                maxCapNum = numbers[i];
            }
        }
        capacityNumber[0] = minCapNum;
        capacityNumber[1] = minCap;
        capacityNumber[2] = maxCapNum;
        capacityNumber[3] = maxCap;
        return capacityNumber;
    }

    public void minMaxCapacityNumberPrint(int... numbers) {
        System.out.println("Numbers: " + Arrays.toString(numbers));
        int[] capacityNumbers = minMaxCapacityNumber(numbers);
        System.out.println("Shortest number: " + capacityNumbers[0]);
        System.out.println("Capacity of shortest number: " + capacityNumbers[1]);
        System.out.println("Longest number: " + capacityNumbers[2]);
        System.out.println("Capacity of longest number: " + capacityNumbers[3]);
    }

}
