package io.zipcoder.microlabs.mastering_loops;


import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Numbers {

    public String oneToTen() {
        String output = ("*** Output ***\n");
        String nextOutput = ("oneToTen()\n");
        String filledString = "";
        for (int i = 1; i <= 10; i++) {
            if (i <= 9) {
                filledString = filledString + Integer.toString(i) + "\n";
            } else {
                filledString = filledString + Integer.toString(i);
            }
        }
        return output + nextOutput + filledString;
    }

    public String oddNumbers() {
        String output = ("*** Output ***\n");
        String nextOutput = ("oddNumbers()\n");
        String filledString = "";
        for (int i = 1; i <= 20; i++)
            if (i % 2 != 0 & i < 19) {
                filledString = filledString + Integer.toString(i) + "\n";
            } else if (i == 19) {
                filledString = filledString + Integer.toString(i);
            }
        return output + nextOutput + filledString;
    }

    public String squares() {
        String output = ("*** Output ***\n");
        String nextOutput = ("squares()\n");
        String filledString = "";
        for (int i = 1; i <= 10; i++) {
            if (i <= 9) {
                filledString = filledString + Integer.toString(i * i) + "\n";
            } else if (i == 10) {
                filledString = filledString + Integer.toString(i * i);
            }

        }
        return output + nextOutput + filledString;
    }

    //one part will always be the same, one part will always be random...assume the same is right, check values of random
    public String random4() {
        Random random = new Random();

        String numStart = "random4()\n*** Output ***\n";
        String numList = "";

        for (int i = 1; i <= 4; i++) {
            int num = random.nextInt(10) + 1;

            if (i < 4) {
                numList = numList + Integer.toString(num) + "\n";
            } else {
                numList = numList + Integer.toString(num);
            }

        }

        return numStart + numList;
    }

    public String even() {
        String output = ("*** Output ***\n");
        String nextOutput = ("even()\n");
        String filledString = "";
        for (int i = 1; i < 20; i++)
            if (i % 2 == 0 & i < 17) {
                filledString = filledString + Integer.toString(i) + "\n";
            } else if (i == 18) {
                filledString = filledString + Integer.toString(i);
            }
        return output + nextOutput + filledString;

    }

    public String powers() {

        String output = ("*** Output ***\n");
        String nextOutput = ("powers()\n");
        String filledString = "";
        for (double i = 1; i <= 8; i++) {
            if (i <= 7) {
                filledString = filledString + Double.toString(Math.pow(2, i)) + "\n";
            } else if (i == 8) {
                filledString = filledString + Double.toString(Math.pow(2, i));
            }

        }
        return output + nextOutput + filledString.replace(".0", "");
    }

}
