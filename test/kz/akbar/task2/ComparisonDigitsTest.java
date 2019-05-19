package kz.akbar.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComparisonDigitsTest extends Task2Test {

    private final ComparableDigits comparableDigits;
    private final ComparisonDigits comparisonDigits;
    private int expectedNumber;

    protected ComparisonDigitsTest(ComparableDigits comparableDigits, int expectedNumber) {
        this.comparableDigits = comparableDigits;
        this.comparisonDigits = new ComparisonDigits(comparableDigits);
        this.expectedNumber = expectedNumber;
    }

    @Test
    public void compareDigitsNumbers() {
        assertEquals(expectedNumber,comparisonDigits.compareDigitsNumbers(NUMBERS));
    }
}