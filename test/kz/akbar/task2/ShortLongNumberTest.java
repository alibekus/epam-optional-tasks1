package kz.akbar.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortLongNumberTest extends Task2Test {

    private ShortLongNumber shortLongNumber;
    private int shortNum;
    private int shortNumCap;
    private int longNum;
    private int longNumCap;
    private int[] shortLongNums;

    public ShortLongNumberTest() {
        this.shortLongNumber = new ShortLongNumber();
            shortLongNums = shortLongNumber.minMaxCapacityNumber(NUMBERS);
    }

    @Before
    public void setUp() throws Exception {
        shortNum = shortLongNums[0];
        shortNumCap = shortLongNums[1];
        longNum = shortLongNums[2];
        longNumCap = shortLongNums[3];
    }

    @Test
    public void minMaxCapacityNumber() {
        assertEquals(1234,shortNum);
        assertEquals(4,shortNumCap);
        assertEquals(1284314567,longNum);
        assertEquals(10,longNumCap);
    }
}