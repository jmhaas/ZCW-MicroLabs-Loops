package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {
        String output = ("*** Output ***\n");
        String nextOutput = ("triangle()");
        String triangle = "";

        for (int i = 1; i <= 6; i++) {
            for (int a = 1; a < i; a++) {
                triangle += ("*");
            }
            if (i <= 5) {
                triangle += ("\n");
            }
        }
        return output + nextOutput + triangle;
    }



    public String tableSquare() {
        String output = "*** Output ***\ntableSquare()";
        String tableSquare = "";
        int mult;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                mult = i * j;
                System.out.println(" " + mult);
                if (mult < 10) System.out.println("  ");
                else if (mult < 20) System.out.println(" ");
                tableSquare += "";
            }
            System.out.println();
        }
        return output + tableSquare;
    }


    public String tableSquares(int n) {
        return "";
    }
}
