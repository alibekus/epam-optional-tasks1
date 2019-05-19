package kz.akbar.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimalDifferentNumbersTest extends Task2Test {

    private MinimalDifferentNumbers minimalDifferentNumbers;
    private int minDiffNumber;
    private static final int EXPECTED_NUM = 123132;

    public MinimalDifferentNumbersTest() {
        this.minimalDifferentNumbers = new MinimalDifferentNumbers();
    }

    @Before
    public void setUp() throws Exception {
        minDiffNumber = minimalDifferentNumbers.firstMinimalDistinctDigitsNumber(NUMBERS);
    }

    @Test
    public void firstMinimalDistinctDigitsNumber() {
        assertEquals(EXPECTED_NUM,minDiffNumber);
    }
}