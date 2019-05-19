package kz.akbar.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessAverageNumbersTest extends Task2Test {

    private LessAverageNumbers lessAverageNumbers;
    private int[] caps;
    private int[] nums;
    private int average;
    private int expectedAverage = 6;
    private int[] expectedNums = {1234, 45678, 12433, 23423, 2468};
    private int[] expectedCaps = {4, 5, 5, 5, 4};

    public LessAverageNumbersTest() {
        this.lessAverageNumbers = new LessAverageNumbers();
    }

    @Before
    public void setUp() throws Exception {
        lessAverageNumbers.extractLessAverageCapacityNumbers(NUMBERS);
        average = lessAverageNumbers.getAverageCapacity();
        caps = lessAverageNumbers.getLessAverageCapacities();
        nums = lessAverageNumbers.getLessAverageCapacityNumbers();
    }

    @Test
    public void extractLessAverageCapacityNumbers() {
        assertEquals(expectedAverage, average);
        assertArrayEquals(expectedNums,nums);
        assertArrayEquals(expectedCaps,caps);
    }
}