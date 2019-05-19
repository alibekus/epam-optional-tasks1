package kz.akbar.task2;

import java.util.Arrays;

public class OptionalTask2 {

    private static final int[] NUMBERS
            = {1234256, 1234, 123456, 1284314567, 45678, 123132, 12433, 1250345, 123495678, 23423, 2468, 123456};

    public static void main(String[] args) {
        new ShortLongNumber().minMaxCapacityNumberPrint(NUMBERS);
        System.out.println("Ascending sort of NUMBERS: " + Arrays.toString(new SortNumbers().ascendingSort(NUMBERS)));
        LessAverageNumbers lessAverageNumbers = new LessAverageNumbers();
        lessAverageNumbers.extractLessAverageCapacityNumbers(NUMBERS);
        System.out.println("Numbers, which capacity less than average capacity " + lessAverageNumbers.getAverageCapacity() + ":");
        System.out.println("Numbers: " + Arrays.toString(lessAverageNumbers.getLessAverageCapacityNumbers()));
        System.out.println("Capacities: " + Arrays.toString(lessAverageNumbers.getLessAverageCapacities()));
        System.out.println("First number with minimal distinct digits: "
                + new MinimalDifferentNumbers().firstMinimalDistinctDigitsNumber(NUMBERS));
        EvenDigitsNumbers evenDigitsNumbers = new EvenDigitsNumbers();
        evenDigitsNumbers.onlyEvenDigitsNumbersCount(NUMBERS);
        System.out.println("The count of NUMBERS with only even digits is : "
                + evenDigitsNumbers.getOnlyEvenCount());
        System.out.println("The count of NUMBERS, where odd and even digits are equal is: "
                + evenDigitsNumbers.getEvenOddEqualityCount());
        System.out.println("The first number with ascending digits: " + new ComparisonDigits(new AscendingNumbers()).compareDigitsNumbers(NUMBERS));
        System.out.println("The first number with unique digits: " + new ComparisonDigits(new OnlyUniqueDigits()).compareDigitsNumbers(NUMBERS));
    }
}
