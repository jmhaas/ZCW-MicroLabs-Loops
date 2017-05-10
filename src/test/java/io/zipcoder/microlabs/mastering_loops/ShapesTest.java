package io.zipcoder.microlabs.mastering_loops;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*** Output ***\ntriangle()\n*\n**\n***\n****\n*****";

         //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals("This should be a left triangle.", expected, actual);

    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*** Output ***\ntableSquare()\n1  2  3  4\n2  4  6  8\n3  6  9  12\n4  8  12  16";

        //: When
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals("This should be a 4x4 table square.", expected, actual);
    }
}
