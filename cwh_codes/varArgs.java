
import java.util.*;
import java.io.*;

public class varArgs {

    static int sum(int a, int b, int c) {
        return a + b + c;

    }

    static int sum(int... arr) {
        int res = 0;
        for (int a : arr) {
            res += a;

        }
        return res;

    }

    static int avg(int... arr) {
        int res = 0;
        for (int a : arr) {
            res += a;

        }
        return res / arr.length;
    }

    public static void main(String args[]) {
        // System.out.println("the sum of number is : ", sum(...arr, 4,5,6));
        System.out.println("the sum of number is : " + sum(4, 5, 6));

    }
}
