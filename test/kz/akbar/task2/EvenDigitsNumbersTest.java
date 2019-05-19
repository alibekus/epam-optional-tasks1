package kz.akbar.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenDigitsNumbersTest extends Task2Test {

    private EvenDigitsNumbers evenDigitsNumbers;
    private int evenNumberCount;
    private int evenOddNumberCount;
    private static final int EXPECTED_EVEN_COUNT = 1;
    private static final int EXPECTED_ODD_EVEN_COUNT = 7;

    public EvenDigitsNumbersTest() {
        this.evenDigitsNumbers = new EvenDigitsNumbers();
    }

    @Before
    public void setUp() throws Exception {
        evenDigitsNumbers.onlyEvenDigitsNumbersCount(NUMBERS);
        evenNumberCount = evenDigitsNumbers.getOnlyEvenCount();
        evenOddNumberCount = evenDigitsNumbers.getEvenOddEqualityCount();
    }

    @Test
    public void onlyEvenDigitsNumbersCount() {
        assertEquals(EXPECTED_EVEN_COUNT, evenNumberCount);
        assertEquals(EXPECTED_ODD_EVEN_COUNT, evenOddNumberCount);
    }
}