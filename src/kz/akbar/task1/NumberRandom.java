package kz.akbar.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberRandom {
    public void randomNumber() throws IOException {
        System.out.print("How many random number do you want to print? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(br.readLine());
        System.out.println("Random numbers in separate line: ");
        for (int i = 1; i <= numberCount; i++) {
            System.out.println("Random #" + i + ": " + Math.random());
        }
        System.out.println("Random numbers in one line: ");
        for (int i = 0; i < numberCount; i++) {
            System.out.print(Math.random() + " ");
        }
    }
}
