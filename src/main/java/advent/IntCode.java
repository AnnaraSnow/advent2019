package advent;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class IntCode {
    public int[] opcode1(int[] input, int i) {

        int a = input[i + 1];
        int b = input[i + 2];
        int res = input[i + 3];

        input[res] = input[a] + input[b];

        return input;
    }

    public int[] opcode2(int[] input, int i) {
        int a = input[i + 1];
        int b = input[i + 2];
        int res = input[i + 3];

        input[res] = input[a] * input[b];

        return input;
    }

    public int[] executeOperations(int[] input) {

        for (int i = 0; i < input.length && input[i] != 99; i = i + 4) {
            if (input[i] == 1) {
                input = opcode1(input, i);
            } else if (input[i] == 2) {
                input = opcode2(input, i);
            }
        }

        System.out.println(Arrays.toString(input));

        return input;
    }

    public static void main(String[] args) {

        IntCode intCode = new IntCode();

        try (Scanner scanner = new Scanner(new File("src/main/resources/inputIntCode.txt"))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                int[] input = convertArrayIntoInts(line.split(","));

                intCode.executeOperations(input);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static int[] convertArrayIntoInts(String[] line) {

        int[] res = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            res[i] = Integer.parseInt(line[i]);
        }

        return res;
    }
}
