package kz.akbar.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;

public class Months {
    public static void main(String[] args) throws IOException {
        int monthNumber = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! Input one number from 1 to 12 (inclusively). For exit press '0'.");
        for(;;) {
            try {
                monthNumber = Integer.parseInt(br.readLine());
                if (monthNumber == 0) {
                    System.exit(0);
                }
                if (monthNumber < 1 || monthNumber > 12) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException exc) {
                System.out.println("Enter only number from 1 to 12 (inclusively)!");
                continue;
            }
            System.out.println("The month of number " + monthNumber + " is " + Month.of(monthNumber));
        }
    }
}
