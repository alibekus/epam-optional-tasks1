package kz.akbar.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ComparisonDigits {

    private static final Logger LOG = Logger.getLogger(ComparisonDigits.class.getName());
    private ComparableDigits comparableDigits;
    private MinimalDifferentNumbers minimalDifferentNumbers;

    public ComparisonDigits(ComparableDigits comparableDigits) {
        this.comparableDigits = comparableDigits;
        this.minimalDifferentNumbers = new MinimalDifferentNumbers();
    }

    public int compareDigitsNumbers(int[] numbers) {
        LOG.info("Compare Digits Numbers: " + Arrays.toString(numbers) + " by " + comparableDigits.getClass().getTypeName());
        List<Integer> conditionDigitsNumbers = new ArrayList<>();
        boolean condition = false;
        for (int number : numbers) {
            int[] digits = minimalDifferentNumbers.numberDigits(number);
            Arrays.sort(digits);
            int prev = digits[0];
            for (int i = 1; i < digits.length; i++) {
                if (comparableDigits.compareDigits(prev,digits[i])) {
                    condition = true;
                    prev = digits[i];
                } else {
                    condition = false;
                    break;
                }
            }
            if (condition) {
                conditionDigitsNumbers.add(number);
            }
        }
        return conditionDigitsNumbers.get(0);
    }
}
