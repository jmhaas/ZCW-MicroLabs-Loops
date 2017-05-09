package io.zipcoder.microlabs.mastering_loops;


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
        return "";
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
                filledString = filledString + Double.toString(Math.pow(2,i)) + "\n";
            } else if (i == 8) {
                filledString = filledString + Double.toString(Math.pow(2,i));
            }

        }
        return output + nextOutput + filledString.replace(".0", "");
    }

}
