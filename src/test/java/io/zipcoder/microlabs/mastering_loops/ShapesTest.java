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

        //: When

        //: Then
    }
}
