package kz.akbar.task2;

import java.util.Arrays;
import java.util.logging.Logger;

public class MinimalDifferentNumbers {
    private static final Logger LOG = Logger.getLogger(MinimalDifferentNumbers.class.getName());
    private ShortLongNumber shortLongNumber;
    public MinimalDifferentNumbers() {
        this.shortLongNumber = new ShortLongNumber();
    }

    private int numberOfDifferentDigits(int number) {
        int[] distinctDigits = Arrays.stream(numberDigits(number)).sorted().distinct().toArray();
        return distinctDigits.length;
    }

    int[] numberDigits(int number) {
        int capacity = shortLongNumber.numberCapacity(number);
        int[] digits = new int[capacity];
        for (int i = capacity - 1; i >= 0 ; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    public int firstMinimalDistinctDigitsNumber(int[] numbers) {
        LOG.info("Getting first number with minimum distinct digits from: " + Arrays.toString(numbers));
        int minIndex = -1;
        int minNumOfDistinctDigit = Integer.MAX_VALUE;
        int curNumOfDistinctDigit = 0;
        for (int i = 0; i < numbers.length; i++) {
            curNumOfDistinctDigit = numberOfDifferentDigits(numbers[i]);
            if (minNumOfDistinctDigit > curNumOfDistinctDigit) {
                minNumOfDistinctDigit = curNumOfDistinctDigit;
                minIndex = i;
            }
        }
        return numbers[minIndex];
    }
}
