package advent;

public class IntCode {
    public int[] opcode1(int[] input) {

        int a = input[1];
        int b = input[2];
        int res = input[3];

        input[res] = input[a] + input[b];

        return input;
    }

    public int[] opcode2(int[] input) {
        int a = input[1];
        int b = input[2];
        int res = input[3];

        input[res] = input[a] * input[b];

        return input;
    }
}
