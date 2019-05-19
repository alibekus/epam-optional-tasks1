package kz.akbar.task2;

import java.util.*;
import java.util.logging.Logger;

public class LessAverageNumbers {
    private static final Logger LOG = Logger.getLogger(LessAverageNumbers.class.getName());
    private int[] numbers;
    private SortNumbers sortNumbers;
    private int averageCapacity;
    private List<Integer> lessAverageCapacities = new ArrayList<>();
    private List<Integer> lessAverageCapacityNumbers = new ArrayList<>();

    public LessAverageNumbers() {
        this.sortNumbers = new SortNumbers();
    }

    public int getAverageCapacity() {
        return averageCapacity;
    }

    public int[] getLessAverageCapacities() {
        int[] capacities = new int[lessAverageCapacities.size()];
        for (int i = 0; i < capacities.length; i++) {
            capacities[i] = lessAverageCapacities.get(i);
        }
        return capacities;
    }

    public int[] getLessAverageCapacityNumbers(){
        int[] numbers = new int[lessAverageCapacityNumbers.size()];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = lessAverageCapacityNumbers.get(i);
        }
        return numbers;
    }

    public void extractLessAverageCapacityNumbers(int... numbers) {
        LOG.info("Extracting numbers with capacity less than average capacity of " + Arrays.toString(numbers));
        int[] capacities = new int[numbers.length];
        ShortLongNumber shortLongNumber = new ShortLongNumber();
        for (int i = 0; i < numbers.length; i++) {
            capacities[i] = shortLongNumber.numberCapacity(numbers[i]);
        }
        averageCapacity = (int) Arrays.stream(capacities).average().getAsDouble();
        for (int i = 0; i < capacities.length; i++) {
            if (capacities[i] < averageCapacity) {
                lessAverageCapacities.add(capacities[i]);
                lessAverageCapacityNumbers.add(numbers[i]);
            }
        }
    }
}
