package kz.akbar.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDigitsNumbers {
    private MinimalDifferentNumbers minimalDifferentNumbers;
    List<Integer> oddEvenDigitsNumbers = new ArrayList<>();
    private int onlyEvenCount;
    private int oddEvenEqualityCount;

    public int getOnlyEvenCount() {
        return onlyEvenCount;
    }

    public int getOddEvenEqualityCount() {
        return oddEvenEqualityCount;
    }

    public EvenDigitsNumbers() {
        this.minimalDifferentNumbers = new MinimalDifferentNumbers();
    }

    private boolean isDigitsEven(int number){
        int[] numDigits = minimalDifferentNumbers.numberDigits(number);
        return Arrays.stream(numDigits).boxed().allMatch(x -> x % 2 == 0);
    }

    private int oddEvenDigitsEqualityNumberCount(List<Integer> numbers) {
        List<Integer> oddEvenDigitsEqualityNums = new ArrayList<>();
        for(int number : numbers) {
            int evenCount = 0;
            int[] digits = minimalDifferentNumbers.numberDigits(number);
            for (int digit : digits){
                if (digit % 2 == 0) {
                    evenCount++;
                }
            }
            if (evenCount == digits.length/2) {
                oddEvenDigitsEqualityNums.add(number);
            }
        }
        return oddEvenDigitsEqualityNums.size();
    }

    public void onlyEvenDigitsNumbersCount(int[] numbers) {
        List<Integer> evenDigitsNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (isDigitsEven(numbers[i])) {
                evenDigitsNumbers.add(numbers[i]);
            } else {
                oddEvenDigitsNumbers.add(numbers[i]);
            }
        }
        onlyEvenCount = evenDigitsNumbers.size();
        oddEvenEqualityCount = oddEvenDigitsEqualityNumberCount(oddEvenDigitsNumbers);
    }

}
