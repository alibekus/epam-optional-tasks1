package kz.akbar.task2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortNumbersTest {

    private SortNumbers sortNumbers;
    private int[] unsorted;
    private int[] sorted;
    private int[] expected;

    public SortNumbersTest() {
        this.sortNumbers = new SortNumbers();
        this.unsorted = new int[]{1234256, 1234, 123456, 1284314567};
        this.sorted = new int[unsorted.length];
        this.expected = new int[]{1234, 123456, 1234256, 1284314567};
    }

    @Before
    public void setUp() throws Exception {
        sorted = sortNumbers.ascendingSort(unsorted);
    }

    @Test
    public void ascendingSort() {
        assertArrayEquals(expected,sorted);
    }
}