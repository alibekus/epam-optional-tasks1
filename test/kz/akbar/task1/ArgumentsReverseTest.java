package kz.akbar.task1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentsReverseTest {

    private int[] numbers;
    private final int SIZE = 5;
    final ArgumentsReverser reverser;

    public ArgumentsReverseTest() {
        this.reverser = new ArgumentsReverser();
    }

    @Before
    public void setUp() {
        numbers = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = i + 1;
        }
    }

    @Test
    public void reverseArguments() {
        int[] reverse = reverser.reverseArguments(numbers);
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            assertEquals(numbers[i], reverse[j]);
        }
    }
}
