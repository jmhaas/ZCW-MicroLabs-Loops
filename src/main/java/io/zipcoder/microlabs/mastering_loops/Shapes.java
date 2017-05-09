package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle() {
        String output = ("triangle()\n");
        String nextOutput = ("*** Output ***\n");
        String triangle = "";

        for (int i = 1; i <= 5; i++) {
            if (i <= 5) {
                triangle = triangle + Integer.toString(i) + "\n";
            }

            for (int a = 1; a <= i; a++) {
                if (a <= i) {
                    triangle = triangle + Integer.toString(a);

                    System.out.println("*");
                }
                System.out.println();
            }
        }
        return nextOutput + output + triangle;
    }

    public String tableSquare() {
        return "";
    }

    public String tableSquares(int n) {
        return "";
    }
}
