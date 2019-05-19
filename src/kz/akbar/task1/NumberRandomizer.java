package kz.akbar.task1;

import java.io.IOException;
import java.util.Random;

public class NumberRandomizer extends Random {
    public int[] getRandomNumbers(int randomNumber) throws IOException {
        int[] randoms = new int[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            randoms[i] = this.nextInt();
        }
        return randoms;
    }
}
