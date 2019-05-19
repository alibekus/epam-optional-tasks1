package kz.akbar.task2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AscendingNumbersTest.class,
        EvenDigitsNumbersTest.class,
        LessAverageNumbersTest.class,
        MinimalDifferentNumbersTest.class,
        OnlyUniqueDigitsTest.class,
        ShortLongNumberTest.class,
        SortNumbersTest.class,
})
public class Task2Tests {
}
