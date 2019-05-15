package kz.akbar.task2;

import java.util.Arrays;

public class OptionalTask2 {

    private static int[] numbers
            = {1234256, 1234, 123456, 1284314567, 45678, 123132, 12433, 1250345, 123495678, 23423, 2468, 123456};

    public static void main(String[] args) {
        new ShortLongNumber().minMaxCapacityNumberPrint(numbers);
        System.out.println("Ascending sort of numbers: " + Arrays.toString(new SortNumbers().ascendingSort(numbers)));
        new LessAverageNumbers(numbers).lessAverageCapacityNumbers();
        System.out.println("First number with minimal distinct digits: "
                + new MinimalDifferentNumbers().firstMinimalDistinctDigitsNumber(numbers));
        EvenDigitsNumbers evenDigitsNumbers = new EvenDigitsNumbers();
        evenDigitsNumbers.onlyEvenDigitsNumbersCount(numbers);
        System.out.println("The count of numbers with only even digits is : "
                + evenDigitsNumbers.getOnlyEvenCount());
        System.out.println("The count of numbers, where odd and even digits are equal is: "
                + evenDigitsNumbers.getOddEvenEqualityCount());
        System.out.println("The first number with ascending digits: " + new ComparisonDigits(new AscendingNumbers()).compareDigitsNumbers(numbers));
        System.out.println("The first number with unique digits: " + new ComparisonDigits(new OnlyUniqueDigits()).compareDigitsNumbers(numbers));
    }
}
