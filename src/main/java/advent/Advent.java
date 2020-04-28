package advent;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Advent {
    /**
     * Fuel required to launch a given module is based on its mass.
     * Specifically, to find the fuel required for a module, take its mass, divide by three,
     * round down, and subtract 2.
     *
     * @param mass
     * @return fuel
     */
    public int calculateModuleFuel(int mass) {
        return (mass / 3) - 2;
    }

}
