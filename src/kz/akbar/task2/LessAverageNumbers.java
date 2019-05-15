package kz.akbar.task2;

import java.util.*;

public class LessAverageNumbers {
    private int[] numbers;
    private SortNumbers sortNumbers;

    public LessAverageNumbers(int... numbers) {
        this.numbers = numbers;
        this.sortNumbers = new SortNumbers();
    }



    public void lessAverageCapacityNumbers() {
        int[] capacities = new int[numbers.length];
        Map<Integer,Integer> capacityNumbers = new TreeMap<>();
        ShortLongNumber shortLongNumber = new ShortLongNumber();
        for (int i = 0; i < numbers.length; i++) {
            capacities[i] = shortLongNumber.numberCapacity(numbers[i]);
            capacityNumbers.put(capacities[i], numbers[i]);
        }
        int average = (int) Arrays.stream(capacities).average().getAsDouble();
        List<Integer> lessAverageCapacities = new ArrayList<>();
        List<Integer> lessAverageCapacityNumbers = new ArrayList<>();
        System.out.println("Numbers, which capacity less than average capacity " + average + ":");
        for (int i = 0; i < capacities.length; i++) {
            if (capacities[i] < average) {
                lessAverageCapacities.add(capacities[i]);
                lessAverageCapacityNumbers.add(capacityNumbers.get(capacities[i]));
            }
        }
        System.out.println(lessAverageCapacityNumbers);
    }
}
