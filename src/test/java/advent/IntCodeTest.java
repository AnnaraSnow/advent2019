package advent;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

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

        assertTrue(Arrays.equals(new int[]{1, 2, 2, 4, 1}, intCode.opcode1(input)));

    }

}