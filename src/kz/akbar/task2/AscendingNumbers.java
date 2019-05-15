package kz.akbar.task2;

public class AscendingNumbers implements ComparableDigits {
    private MinimalDifferentNumbers minimalDifferentNumbers;

    @Override
    public boolean compareDigits(int digit1, int digit2) {
        return digit1 < digit2;
    }
}
