package kz.akbar.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserGreeting {
    public void greetingUser() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        String name = br.readLine();
        System.out.println("Hello dear " + name + "!");
    }
}
