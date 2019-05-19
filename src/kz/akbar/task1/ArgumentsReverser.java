package kz.akbar.task1;

public class ArgumentsReverser {

    public int[] reverseArguments(int... args) {
        int[] reverse = new int[args.length];
        for (int i = args.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = args[i];
        }
        return reverse;
    }
}
