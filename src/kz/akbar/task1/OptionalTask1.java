package kz.akbar.task1;

import java.io.IOException;

public class OptionalTask1 {

    public static void main(String[] args) throws IOException {
        (new UserGreeting()).greetingUser();
        (new ArgumentsReverse()).reverseArguments(1,2,3,4,5);
        (new NumberRandom()).randomNumber();
    }
}
