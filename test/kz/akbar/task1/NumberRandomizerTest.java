package kz.akbar.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberRandomizerTest {

    private final int NUMBER_OF_RANDOMS;
    private NumberRandomizer randomizer;
    private int[] randomNumbers;
    private int[] anotherRandomNumbers;

    public NumberRandomizerTest() {
        this.NUMBER_OF_RANDOMS = 5;
        this.randomizer = new NumberRandomizer();
    }

    @Before
    public void setUp() throws Exception {
        randomNumbers = randomizer.getRandomNumbers(NUMBER_OF_RANDOMS);
        anotherRandomNumbers = randomizer.getRandomNumbers(NUMBER_OF_RANDOMS);
    }

    @Test
    public void getRandomNumbers() {
        assertEquals(NUMBER_OF_RANDOMS, randomNumbers.length);
        for (int i = 0; i < randomNumbers.length; i++) {
            assertNotEquals(randomNumbers[i], anotherRandomNumbers[i]);
        }
    }
}