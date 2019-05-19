package kz.akbar.task1;

import kz.akbar.util.InputChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OptionalTask1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        (new UserGreeting()).greetingUser();
        System.out.println("------------Random NUMBERS---------------------------");
        System.out.print("How many random number do you want to print? ");
        int numberCount = InputChecker.inputSingleNumber(br);
        System.out.println("Random NUMBERS : ");
        System.out.println(Arrays.toString(new NumberRandomizer().getRandomNumbers(numberCount)));
        System.out.println("------------Reverse number---------------------------");
        System.out.print("Enter number separated by space: ");
        int[] numbers = InputChecker.inputNumbersLine(br);
        System.out.println(Arrays.toString(new ArgumentsReverser().reverseArguments(numbers)));
    }
}
