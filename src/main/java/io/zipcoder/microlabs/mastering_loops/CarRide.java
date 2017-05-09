package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

import static java.lang.System.in;

public class CarRide {

    Scanner in = new Scanner(System.in);

    public String areWeThereYetTest() {
        String userInput;
        boolean answer = false;
        while (answer != true) {
            System.out.println("Are we there yet?");
            userInput = in.next();
            if (userInput.equals("yes")) break;


        }

        return "Good";
    }

}

