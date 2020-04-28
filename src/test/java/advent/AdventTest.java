package advent;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventTest {

    private Advent advent;

    @Before
    public void initTest() {
        advent = new Advent();
    }

    @Test
    public void testCalculateModuleFuel() {
        /*
        For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
        For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
        For a mass of 1969, the fuel required is 654.
         */


        assertEquals(2, advent.calculateModuleFuel(12));
        assertEquals(2, advent.calculateModuleFuel(14));
        assertEquals(654, advent.calculateModuleFuel(1969));

    }

    @Test
    public void testTotalFuel() {
        assertEquals(3454942, advent.calculateTotalFuel("src/test/resources/input.txt"));
    }
}