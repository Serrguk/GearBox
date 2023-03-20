import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(gearsMechanism(5, 3)));
    }

    public static int[] gearsMechanism(int value, int rotation) {
        int[] gearsRotations = new int[value];

        gearsRotations[value - 1] = 1;

        for (int i = value - 2; i >= 0; i--) {
            gearsRotations[i] = rotation * gearsRotations[i + 1];
        }
        return gearsRotations;
    }
}
