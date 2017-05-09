package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output = ("triangle()\n");
        String nextOutput = ("*** Output ***\n");
        String triangle = "";

        for (int i = 0; i <= 5; i++){
            for (int a = 1; a <= i; a++){
                System.out.println("*");
            }
            System.out.println();
        }
        return nextOutput + output + triangle;
    }

    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
}
