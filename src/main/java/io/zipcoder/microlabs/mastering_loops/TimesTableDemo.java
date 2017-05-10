package io.zipcoder.microlabs.mastering_loops;

/**
 * Created by justinhaas on 5/9/17.
 */
public class TimesTableDemo {

    public static void main(String[] args) {
        int mult;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                mult = i * j;
                System.out.print(" " + mult);
                if (mult < 10) System.out.print("  ");
                else if (mult < 100) System.out.print(" ");
            }
            System.out.println();
        }
    }
}


