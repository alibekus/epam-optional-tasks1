package kz.akbar.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputChecker {
    public static int inputSingleNumber(BufferedReader br) throws IOException {
        int input;
        for (; ; ) {
            try {
                input = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException exc) {
                System.out.println("Enter only number!");
                continue;
            }
        }
        return input;
    }

    public static int[] inputNumbersLine(BufferedReader br) throws IOException {
        List<Integer> numbersList = new ArrayList<>();
        System.out.println("For exit enter 'exit': ");
        String[] stringItems = br.readLine().split(" ");
        for (String inputItem : stringItems){
            if (inputItem.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            try {
                numbersList.add(Integer.parseInt(inputItem));
            } catch(NumberFormatException exc){
                System.out.println("In the input string non-integer number encountered");
            }
        }
        int[] numbers = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++){
            numbers[i] = numbersList.get(i);
        }
        return numbers;
    }
}
