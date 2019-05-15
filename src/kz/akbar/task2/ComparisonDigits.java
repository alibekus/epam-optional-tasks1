package kz.akbar.task2;

import java.util.ArrayList;
import java.util.List;

public class ComparisonDigits {
    private ComparableDigits comparableDigits;
    private MinimalDifferentNumbers minimalDifferentNumbers;

    public ComparisonDigits(ComparableDigits comparableDigits) {
        this.comparableDigits = comparableDigits;
        this.minimalDifferentNumbers = new MinimalDifferentNumbers();
    }

    public int compareDigitsNumbers(int[] numbers) {
        List<Integer> conditionDigitsNumbers = new ArrayList<>();
        boolean condition = false;
        for (int number : numbers) {
            int[] digits = minimalDifferentNumbers.numberDigits(number);
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
