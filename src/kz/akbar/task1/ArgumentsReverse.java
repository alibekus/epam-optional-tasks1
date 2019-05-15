package kz.akbar.task1;

public class ArgumentsReverse {

    public void reverseArguments(int... args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}
