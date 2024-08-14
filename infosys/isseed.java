import java.util.*;

public class isseed {
    public static boolean isSeed(int seed, int number) {
        int product = seed;
        int original = seed;

        while (seed > 0) {
            int digit = seed % 10;
            product *= digit;
            seed /= 10;
        }

        return product == number;
    }

    public static void main(String args[]) {
        int seed = 45;
        int number = 1000;

        if (isSeed(seed, number)) {
            System.out.println(seed + " is a seed of " + number);
        }
        else {
            System.out.println(seed + " is not a seed of " + number);
        }

    }
}
