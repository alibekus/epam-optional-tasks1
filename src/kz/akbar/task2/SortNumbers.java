package kz.akbar.task2;

import java.util.ArrayList;
import java.util.List;

public class SortNumbers {

    ShortLongNumber shortLongNumber = new ShortLongNumber();

    private List<Integer> numbersList = new ArrayList<>();

    private int minCapNumber() {
        int minCap = shortLongNumber.numberCapacity(numbersList.get(0));
        int minCapNum = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++) {
            int curNumCap = shortLongNumber.numberCapacity(numbersList.get(i));
            if (minCap > curNumCap) {
                minCap = curNumCap;
                minCapNum = numbersList.get(i);
            }
        }
        this.numbersList.remove((Integer) minCapNum);
        return minCapNum;
    }

    public int[] ascendingSort(int... numbers) {
        for (int number : numbers) {
            this.numbersList.add(number);
        }
        int[] sortedNumbers = new int[numbersList.size()];
        for (int i = 0; i < sortedNumbers.length; i++) {
            sortedNumbers[i] = minCapNumber();
        }
        return sortedNumbers;
    }
}
