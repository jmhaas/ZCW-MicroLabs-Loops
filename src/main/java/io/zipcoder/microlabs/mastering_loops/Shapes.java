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





        return "";
    }

    public String tableSquares(int n) {
        return "";
    }
}
