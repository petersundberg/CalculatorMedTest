package ec.se.peter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {      //skriv classNamn +"Test"
    /**
     * Rigorous Test :-)
     */

//-----------------------------------
    @Test
    public void shouldAnswerTrue()
    {
        assertTrue( true );
    }

//-----------------------------------
    @Test
    public void addition_should_answer_twelve() {
        double a = 4;
        double b = 8;
        double expected = 12;

        double actual = Calculator190827.doAddition(a, b);

        assertEquals(expected, actual, 0);
    }

//-----------------------------------
    @Test
    public void subtraction_should_answer_five() {
        double a = 9;
        double b = 4;
        double expected = 5;

        double actual = Calculator190827.doSubtraction(a, b);

        assertEquals(expected, actual, 0);
    }

//-----------------------------------
    @Test
    public void multiplication_should_answer_sixteen() {
        double a = 4;
        double b = 4;
        double expected = 16;

        double actual = Calculator190827.doMultiplication(a, b);

        assertEquals(expected, actual, 0);
    }

//-----------------------------------
    @Test
    public void division_should_answer_sevenPointFive() {
        double a = 15;
        double b = 2;
        double expected = 7.5;

        double actual = Calculator190827.doDivision(a, b);

        assertEquals(expected, actual, 0);
    }

}


