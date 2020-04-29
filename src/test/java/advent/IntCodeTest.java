package advent;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntCodeTest {

    private IntCode intCode;

    @Before
    public void initTest() {
        intCode = new IntCode();
    }

    @Test
    public void testOpcode1() {
        /*
        Opcode 1 adds together numbers read from two positions and stores the result in a third position.

        For example, if your Intcode computer encounters 1,10,20,30, it should read the values at positions 10 and 20,
         add those values, and then overwrite the value at position 30 with their sum.
         */
        int[] input = {1, 2, 2, 3, 1};

        assertArrayEquals(new int[]{1, 2, 2, 4, 1}, intCode.opcode1(input, 0));

    }

    @Test
    public void testOpcode2() {
        /*
        Opcode 2 works exactly like opcode 1, except it multiplies the two inputs instead of adding them.
        Again, the three integers after the opcode indicate where the inputs and outputs are, not their values.
         */

        int[] input = {2, 2, 3, 4, 1};

        assertArrayEquals(new int[]{2, 2, 3, 4, 12}, intCode.opcode2(input, 0));
    }

    @Test
    public void testExecuteOperations() {
        int[] input = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};

        assertArrayEquals(new int[]{3500, 9, 10, 70, 2, 3, 11, 0, 99, 30, 40, 50}, intCode.executeOperations(input));

    }

    @Test
    public void testConvertArrayIntoInts() {
        String[] input = {"1", "2", "3", "4"};

        assertArrayEquals(new int[]{1, 2, 3, 4}, intCode.convertArrayIntoInts(input));
    }
}