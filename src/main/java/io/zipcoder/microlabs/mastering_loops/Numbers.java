package io.zipcoder.microlabs.mastering_loops;


import java.util.Scanner;

import static java.lang.System.in;

public class Numbers {

    public String oneToTen() {
        String output = ("*** Output ***\n");
        String nextOutput = ("oneToTen()\n");
        String filledString = "";
        for (int i = 1; i <= 10; i++) {
            if (i <= 9){
                filledString = filledString + Integer.toString(i) + "\n";
            }
            else{
                filledString = filledString +Integer.toString(i);
            }
        }
        return output + nextOutput + filledString;
    }
    public String oddNumbers(){
        String output = ("*** Output ***\n");
        String nextOutput = ("oddNumbers()\n");
        String filledString = "";
        for (int i = 1; i <= 20; i++)
            if(i % 2 != 0 & i < 19){
                filledString = filledString + Integer.toString(i) + "\n";
            }
            else if(i == 19){
                filledString = filledString + Integer.toString(i);
            }
        return output + nextOutput + filledString;
    }

    public String squares(){
        return "";
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
